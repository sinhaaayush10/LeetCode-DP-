
class Solution{
public:
    int maxGold(int n, int m, vector<vector<int>> M)
    {
        // code here
        vector<vector<int>> dp(n+1,vector<int>(m+1,0));
        int ans=0;
        for(int i =0; i<n; i++){
            dp[i][m-1] = M[i][m-1];
            ans = max(ans,dp[i][m-1]);
        }
        for(int j=m-2; j>=0; j--){
            for(int i=0; i<n; i++){
                if(i-1>=0 && j+1<m){
                    dp[i][j] = max(dp[i][j],dp[i-1][j+1]);
                }
                if(j+1<m){
                    dp[i][j] = max(dp[i][j],dp[i][j+1]);
                }
                if(i+1<n && j+1<m){
                    dp[i][j] = max(dp[i][j],dp[i+1][j+1]);
                }
                dp[i][j]+=M[i][j];
                ans = max(ans,dp[i][j]);
            }
        }
        return ans;
    }
};
