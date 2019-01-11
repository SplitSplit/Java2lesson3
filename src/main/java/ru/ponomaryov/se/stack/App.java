package ru.ponomaryov.se.stack;

/**
 * Hello world!
 */
public class App {

    private static final String TEST_TEXT = "test text";

    public static void main(String[] args) {
        Stack stack = new StackImpl(50);

        for (int i = 0; i < TEST_TEXT.length(); i++) {
            pushToStack(stack, TEST_TEXT.charAt(i));
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(popFromStack(stack));
        }
    }

    private static char popFromStack(Stack stack) {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return ' ';
    }

    private static void pushToStack(Stack stack, char value) {
        if (!stack.isFull()) {
            stack.push(value);
        }
    }
}
