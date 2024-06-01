public class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int ans = 0;
 
      
        for (int i = 1; i < n; i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return ans;
    }

    public static void main(String[] args) {
       
        Solution sol = new Solution();
        String input = "your_input_string"; // Replace with actual input
        System.out.println(sol.scoreOfString(input));
    }
}
