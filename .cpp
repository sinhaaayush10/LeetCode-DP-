class Solution{
    int mod=1e9+7;
public:
    ll countStrings(int n) {
        int dp[n+2];
        memset(dp,0,sizeof(dp));
        dp[1]=2;
        dp[2]=3;
        
        for(int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        }
        return dp[n];
    }
};
