import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public int[] sortByBits(int[] arr) {


        return Arrays.stream(arr)
                .boxed()
                .sorted((Comparator.comparing(Integer::bitCount).thenComparing(Integer::compareTo)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
