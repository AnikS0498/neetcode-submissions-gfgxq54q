class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            var ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(isPair(ch, stack.peek()))
                    stack.pop();
                else{
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isPair(char ch, char peekValue){
        if((ch == ')' && peekValue == '(') || (ch == '}' && peekValue == '{') || (ch == ']' && peekValue == '['))
            return true;
        return false;
    }
}
