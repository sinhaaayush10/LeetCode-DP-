public class Solution {
    public String binaryNextNumber(String s) {
        int n = s.length();
        int countOne = 0;
        int idxZero = -1;
        for(int i = 0; i < n; ++i){
            if(s.charAt(i) == '1') {
                ++countOne;
            } else {
                idxZero = i;
            }
        }
        StringBuilder ans = new StringBuilder();
        if(countOne == n) {
            ans.append("1");
            for(int i = 0; i < n; ++i) {
                ans.append("0");
            }
        } else {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(idxZero, '1');
            for(int i = idxZero + 1; i < n; ++i) {
                sb.setCharAt(i, '0');
            }
            int i = 0;
            while(sb.charAt(i) == '0') ++i;
            for(int j = i; j < n; ++j) {
                ans.append(sb.charAt(j));
            }
        }
        return ans.toString();
    }
}
