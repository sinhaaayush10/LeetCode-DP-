class Solution {
public:
    bool closeStrings(string word1, string word2) {
 
        if (word1.size() != word2.size()) {
            return false;
        }
        
        int a[26] = {0}, b[26] = {0}, mask1 = 0, mask2 = 0;
        
        for (int i = 0; i < word1.size(); i++) {
            a[word1[i] - 'a']++;
            b[word2[i] - 'a']++;
            mask1 |= 1 << (word1[i] - 'a');
            mask2 |= 1 << (word2[i] - 'a');
        };
        
        if (mask1 != mask2) {
            return false;
        }
        
        sort(begin(a), end(a));
        sort(begin(b), end(b));
        
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
            
        return true;
    }
};
