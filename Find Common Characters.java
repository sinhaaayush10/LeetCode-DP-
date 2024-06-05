import java.util.*;

public class Solution {
    public List<String> commonChars(String[] words) {
        int[] last = count(words[0]);
        for (int i = 1; i < words.length; i++) {
            last = intersection(last, count(words[i]));
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (last[i] > 0) {
                result.add(Character.toString((char) ('a' + i))); 
                last[i]--;
            }
        }
        
        return result;
    }
    
    private int[] count(String str) {
        int[] frequency = new int[26];
        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }
        return frequency;
    }
    
    private int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }
}
