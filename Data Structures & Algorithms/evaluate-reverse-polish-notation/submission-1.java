class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            var str = tokens[i];
            if(!(str.equals("*") || str.equals("+") || str.equals("/") || str.equals("-")))
                stack.push(str);
            else{
                var temp1 = stack.pop();
                var temp2 = stack.pop();

                var res = performOperation(temp2, temp1, str);
                stack.push(String.valueOf(res));
            }
        }

        return Integer.parseInt(stack.peek());
    }

    public int performOperation(String temp1, String temp2, String operator){
        int operand1 = Integer.parseInt(temp1);
        int operand2 = Integer.parseInt(temp2);

        int result = 0;
        if(operator.equals("*"))
            result = operand1 * operand2;
        else if(operator.equals("+"))
            result = operand1 + operand2;
        if(operator.equals("-"))
            result = operand1 - operand2;
        if(operator.equals("/"))
            result = operand1 / operand2;

        return result;
    }
}
