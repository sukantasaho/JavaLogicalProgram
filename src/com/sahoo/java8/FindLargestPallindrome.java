import java.util.List;

public class LargestPalindrome {
    public static void main(String[] args) {
        List<String> stringList = List.of("level", "noon", "radar", "java", "madam", "racecar");

        stringList.stream()
                  .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                  .max((a, b) -> Integer.compare(a.length(), b.length()))//or you can use this::max(Comparator.compairingInt(String::length))
                  .ifPresent(System.out::println); // Output: racecar
    }
}
