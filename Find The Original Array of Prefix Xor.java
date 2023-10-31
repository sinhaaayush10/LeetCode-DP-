class Solution {
    public int[] findArray(int[] pre) {
        int[] ans=new int[pre.length];
        ans[0]=pre[0];
        for(int i=1;i<pre.length;i++){
            ans[i]=pre[i-1]^pre[i];
        }
        return ans;
    }
}
