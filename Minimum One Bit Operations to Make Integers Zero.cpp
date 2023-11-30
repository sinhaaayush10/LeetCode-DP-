class Solution {
public:
    int minimumOneBitOperations(int n) {
        vector<int> bits(32,0);
        for(int i = 31; i >= 0; i--){
            if(n & (1 << i)) bits[i] = 1;
        }
        int ret = 0;
        if(bits[31]) ret += (1 << 31);
        for(int i = 30; i >= 0; i--){
            bits[i] ^= bits[i+1];
            if(bits[i]) ret += (1 << i);
        }
        return ret;
    }
};
