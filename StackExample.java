import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
        System.out.println("Popped Element: " + stack.pop());
    }
}

