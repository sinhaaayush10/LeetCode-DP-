class Solution {
public:
    int minBitFlips(int start, int goal) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);
        int ans = 0;
        while (start or goal) {
            ans += ((start % 2) != (goal % 2));
            start /= 2;
            goal /= 2;
        }
        return ans;
    }
};
