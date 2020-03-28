/**
 * StackExample
 */
public class StackExample {

    public static void main(String[] args) {
        String validStringWithBracketsAndParanthesis = "(){}[({})]{}()([[}})";
        StackOperations operations = new StackOperations();
        boolean isValid = operations.isValid(validStringWithBracketsAndParanthesis);
        System.out.println("String to be checked: " + validStringWithBracketsAndParanthesis);
        System.out.println("Is valid? " + isValid);

        System.out.println("---");

        String invalidStringWithBrackets = "(){}[({})]{}()([[]])";
        boolean isValid2 = operations.isValid(invalidStringWithBrackets);
        System.out.println("String to be checked: " + invalidStringWithBrackets);
        System.out.println("Is valid? " + isValid2);
    }
}