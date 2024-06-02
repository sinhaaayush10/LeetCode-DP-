
class Solution {
  public:
    vector<int> constructList(int q, vector<vector<int>> &queries) {
       
       vector<int>ans;
       
       int i=q-1;
       int x=0;
       while(i>=0){
           
           if(queries[i][0]==0)
           ans.push_back(x^queries[i][1]);
           else
           x ^=queries[i][1];
           
           i--;
       }
       ans.push_back(x^0);
       sort(ans.begin(),ans.end());
       return ans;
    }
};
