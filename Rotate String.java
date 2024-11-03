class Solution {
    private int[] findLPS(String patt) {
        int n = patt.length();
        int[] lps = new int[n];
        int j = 0;
        
        for (int i = 1; i < n;) {
            if (patt.charAt(i) == patt.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        
        return lps;
    }
    
    private boolean KMP(String text, String patt, int[] lps) {
        int m = text.length();
        int n = patt.length();
        int i = 0, j = 0;
        
        while (i < m) {
            if (text.charAt(i) == patt.charAt(j)) {
                i++;
                j++;
            }
            if (j == n) return true;
            if (i < m && text.charAt(i) != patt.charAt(j)) {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return false;
    }
    
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        String text = s + s;
        int[] lps = findLPS(goal);
        return KMP(text, goal, lps);
    }
}
