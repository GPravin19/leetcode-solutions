import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> paranthesesCheck = new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                paranthesesCheck.push(c);
            } else {
                if(paranthesesCheck.isEmpty()) 
                    return false;
                char top = (char) paranthesesCheck.pop();
                if((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')){
                    return false;
                }
            }
        }
        return paranthesesCheck.isEmpty();
    }
}