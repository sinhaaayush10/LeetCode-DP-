class Solution {
public:
    vector<int> intersection(vector<int>& a1, vector<int>& a2) {
        set<int> s1(a1.begin(), a1.end());
        set<int> s2(a2.begin(), a2.end());
        set<int> s;
        set_intersection(s1.begin(), s1.end(), s2.begin(), s2.end(),
                inserter(s, s.begin()));

        vector<int> res(s.begin(), s.end());
        return res;
        
    }
};
