class Solution {
    public:
    int passThePillow(int n, int time) {
        int x = (time)/(n-1);
        if(x&1){
            x = (time)%(n-1);
            return n-x;
        }else{
            x = time%(n-1);
            return 1+x;
        }
    }
};
