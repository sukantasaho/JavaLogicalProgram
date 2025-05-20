// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class FindMissingNumbersInArray {
    public static void main(String[] args) {
         int[] arr = {1,3,2,4,6,8,12,13,17,19,20};
          List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
         //find missing numbers in given array
         List<Integer> missingList = new ArrayList<>();
         for(int i = 1; i<=20; i++){
             if(!list.contains(i)){
                 missingList.add(i);
             }
         }
         System.out.println(missingList);
    }
}
 

 