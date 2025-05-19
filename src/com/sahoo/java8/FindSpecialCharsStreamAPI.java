 
import java.util.*;
import java.util.stream.*;
class FindSpecialCharactersStreamAPI {
    public static void main(String[] args) {
           String str = "suksah@gmail#&$";
           
          str.chars()
           .mapToObj(ch -> (char) ch)
           .filter(c -> !Character.isDigit(c) && 
                        !Character.isLetter(c) && 
                        !Character.isWhitespace(c))
           .forEach(System.out::println);
    }
     
}