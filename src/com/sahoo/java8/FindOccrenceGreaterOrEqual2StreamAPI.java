// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;

class FindOccrenceGreaterOrEqual2StreamAPI {
      
      public static void main(String[] args){
             String s = "Raja babu".replaceAll("\\s+","");
             System.out.println(s);
         Map<Character, Long> map =    s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(e->e,Collectors.counting()))
          .entrySet()
            .stream()
            .filter(e -> e.getValue() >= 2)
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
            ));
         System.out.println(map);
       
      }
}
 

 