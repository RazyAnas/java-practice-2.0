package LeetCodeSolutions;

import java.util.Stack;

public class ReversePolishNotation {

    Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {

        // PSEUDOCODE:
        // rule of RPN is that keep adding operands in the stack
        // if operator comes get the previous two operands and do the operator
        // now put the result in the stack again
        // keep doing it until there is no more items from string array to put

        // to keep putting the string we need to:
        // if the string is not an operator we need to convert it to a int
        // converted int need to be put in the stack

        for (var item : tokens) {
            if (!item.equals("+") &&
                    !item.equals("-") &&
                    !item.equals("/") &&
                    !item.equals("*")) {stack.push(Integer.valueOf(item));}
            if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                int second = stack.pop(); // top item
                int first  = stack.pop(); // second top item
                int result = 0;

                switch(item) {
                    case "+": result = first + second; break;
                    case "-": result = first - second; break;
                    case "*": result = first * second; break;
                    case "/": result = first / second; break;
                }

                stack.push(result); // push result back to stack
            }

        }
return stack.peek();
    }
}
