package ru.ponomaryov.se.brackets;

import ru.ponomaryov.se.stack.StackImpl;

public class BracketValidator {

    private String text;

    public BracketValidator(String text) {
        this.text = text;
    }

    public void check() {
        StackImpl stack = new StackImpl(50);
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            switch (currentChar) {
                case '(':
                case '{':
                case '[':
                    stack.push(currentChar);
                    break;
                case ')':
                case '}':
                case ']':
                    checkChar(stack, i, currentChar);
                    break;
                default:
                    break;

            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

    private void checkChar(StackImpl stack, int i, char currentChar) {
        if (stack.isEmpty()) {
            System.out.println("Error: " + currentChar + " at " + i);
            return;
        }
        Character ch = stack.pop();
        if ((ch == '(' && currentChar != ')')
                || (ch == '{' && currentChar != '}')
                || (ch == '[' && currentChar != ']')) {
            System.out.println("Error: " + currentChar + " at " + i);
        }
        return;
    }

    public static void main(String[] args) {
        String textCode = "({}[{])";
        BracketValidator validator = new BracketValidator(textCode);
        validator.check();

    }
}
