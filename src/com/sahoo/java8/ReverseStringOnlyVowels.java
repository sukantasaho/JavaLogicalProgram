// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;

class ReverseStringOnlyVowels {
      
      public static void main(String[] args){
            String str = "safe";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        // Collect vowels in reverse order
        List<Character> reversedVowels = new StringBuilder(
            str.chars()
               .filter(c -> vowels.contains((char) c))
               .mapToObj(c -> (char) c)
               .map(String::valueOf)
               .collect(Collectors.joining())
        ).reverse().chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        // Replace vowels in the original string
        String result = IntStream.range(0, str.length())
            .mapToObj(i -> vowels.contains(str.charAt(i)) ? String.valueOf(reversedVowels.remove(0)) : String.valueOf(str.charAt(i)))
            .collect(Collectors.joining());

        System.out.println(result);  // Output: sef
      }
}
 

 