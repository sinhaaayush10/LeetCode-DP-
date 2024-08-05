class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        unordered_map<string,int> hash;
        for(string &str:arr){
            hash[str]++;
        }
        for(string& str:arr){
            if(hash[str]==1) k--;
            if(k==0) return str;
        }
        return "";
    }
};
