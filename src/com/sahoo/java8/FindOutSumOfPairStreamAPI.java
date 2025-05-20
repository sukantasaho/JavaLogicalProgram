import java.util.*;
import java.util.stream.*;
public class FindOutSumOfPairStreamAPI {

    public static void main(String[] args) {
        int[] arr = {1, 23, 22, 2, 20, 4, 34, 12, 12, 12, 14, 12, 14, 36, 14, 10};
        int target = 24;

        List<String> pairs = IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == target)
                        .mapToObj(j -> "[" + arr[i] + "," + arr[j] + "]"))
                .distinct() // Optional: avoids duplicates like [12,12] appearing multiple times
                .collect(Collectors.toList());

        System.out.println("Pairs with sum " + target + ": " + pairs);
    }
}
