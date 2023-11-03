class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int k=1;
        int i=0;

        while(i<target.length && k<=n){
            stack.push(target[i]);
            l.add("Push");
            if(target[i]==k){
                i++;
                k++;
            }else{
                stack.pop();
                l.add("Pop");
                k++;
            }
        }
        return l;

        
    }
}
