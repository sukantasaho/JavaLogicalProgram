 
import java.util.*;
import java.util.stream.*;
class PrimeFilter {
    public static void main(String[] args) {
         int[] arr = {3, 2, 5, 6, 8, 9, 12, 34, 43, 21, 35, 78, 876, 65, 32, 21, 23, 45, 67, 89};

        /*Arrays.stream(arr)
              .filter(PrimeFilter::isPrime)
              .forEach(System.out::println); */// Print prime numbers
              //if you want store prime numbers in a list
           List<Integer> primeList =   Arrays.stream(arr)
              .filter(PrimeFilter::isPrime).boxed()
              .collect(Collectors.toList());
              System.out.println(primeList);
    }
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        return java.util.stream.IntStream.rangeClosed(2, (int)Math.sqrt(num))
                                         .noneMatch(i -> num % i == 0);
    }
}