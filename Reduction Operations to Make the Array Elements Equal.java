class Solution {
   public int reductionOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int previous = nums[0];
        int ans = 0;
        for (int i=1 ; i<n ; i++) {
            if ( previous != nums[i] ) {
                ans+=n-i;
                previous = nums[i];
            }
        }
        return ans;
    }
}
