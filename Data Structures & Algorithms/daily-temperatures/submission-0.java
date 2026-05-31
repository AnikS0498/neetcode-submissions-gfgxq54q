class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;
        Stack<Integer> s = new Stack<>();
        int[] res = new int[len];
        for(int i=len-1; i>=0;i--){

            while(!s.isEmpty() && temp[s.peek()] <= temp[i]){
                s.pop();
            }

            if(!s.isEmpty()){
                res[i] = Math.abs(s.peek() - i);
            }

            s.push(i);
        }
        return res;
    }
}
