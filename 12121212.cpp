class Solution
{
  public:
    vector<int> findOrder(int n, int m, vector<vector<int>> prerequisites) 
    {
        vector<int>indegree(n);
        vector<int>adj[n];
        for(auto &pre:prerequisites){
            adj[pre[1]].push_back(pre[0]);
        }
        for(int i = 0;i < n;i++){
            for(auto &adjNode:adj[i]){
                indegree[adjNode]++;
            }
        }
        queue<int>q;
        for(int i = 0;i < n;i++){
            if(indegree[i]==0)q.push(i);
        }
        vector<int>ans;
        while(!q.empty()){
            int top = q.front();
            q.pop();
            ans.push_back(top);
            for(auto &adjNode:adj[top]){
                indegree[adjNode]--;
                if(indegree[adjNode]==0)q.push(adjNode);
            }
        }
        if(ans.size()==n)return ans;
        return {};
    }
};
