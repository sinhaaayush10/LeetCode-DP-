class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int hash[256] = {0};
        bool charsMapped[256] = {0};
        for(int i =0; i <s.size(); i++){
            if(hash[s[i]] == 0 && charsMapped[t[i]] == false){
                hash[s[i]] = t[i];
                charsMapped[t[i]] = true;
            }
        }
        for(int i = 0 ; i<s.size() ; i++){
            if(hash[s[i]] != t[i]) return false;
        }
        
        return true; 
    }
};
