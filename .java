import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int specialArray(int[] nums) {
        // Sort the array in descending order
        Arrays.sort(nums);
        // Reverse the array to get the descending order
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        int n = nums.length;
        
        // Check the edge cases
        if (nums[n - 1] > n) return n;
        if (nums[0] == 0) return -1;

        int l = 0, r = n - 1, m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] > m) {
                l = m + 1;
            } else if (nums[m] < m) {
                r = m - 1;
            } else {
                return -1;
            }
        }
        return nums[m] > m ? m + 1 : m;
    }
}
