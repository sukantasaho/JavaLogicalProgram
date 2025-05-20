import java.util.*;
import java.util.stream.*;

class FindFirstRepeatingCharStreamAPI {
    public static void main(String[] args) {
        String word = "JACKJAL";

        Character ch = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1) // changed from == 1 to > 1
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(ch); // Output: J (first repeating character)
    }
}