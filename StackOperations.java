import java.util.HashMap;
import java.util.Stack;

/**
 * StackOperations
 */
public class StackOperations {

    HashMap<Character, Character> mapping;

    StackOperations() {
        this.mapping = new HashMap<>();
        this.mapping.put(')', '(');
        this.mapping.put('}', '{');
        this.mapping.put(']', '[');
    }

    boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // check if c is a closing element
            if (this.mapping.containsKey(c)) {
                // if its a closing element, get the top element from stack
                char topElement = stack.isEmpty()? '#' : stack.pop();
                // top element has to match the latest element from the stack
                if (topElement != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}