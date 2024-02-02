import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    result.add(num);
                }
                ++nextDigit;
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int low = 100;
        int high = 3000;
        List<Integer> result = solution.sequentialDigits(low, high);

        System.out.println("Result: " + result);
    }
}
