import java.util.Scanner;

class CustomStack {
    private char[] stack;
    private int top;
    private int maxSize;

    public CustomStack(int size) {
        maxSize = size;
        stack = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (top < maxSize - 1) {
            stack[++top] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return ' ';
    }

    public char peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return ' ';
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class InfixToPrefixPostfixConverter {

    public static String infixToPrefix(String infixExpression) {
        StringBuilder prefix = new StringBuilder();
        CustomStack operators = new CustomStack(infixExpression.length());
        CustomStack reverseStack = new CustomStack(infixExpression.length());

        for (int i = 0; i < infixExpression.length(); i++) {
            char token = infixExpression.charAt(i);

            if (isOperand(token)) {
                prefix.append(token);
                while (!reverseStack.isEmpty() && isOperand(reverseStack.peek())) {
                    prefix.append(reverseStack.pop());
                }
                prefix.append(" ");
            } else if (token == ')') {
                operators.push(token);
            } else if (token == '(') {
                while (!operators.isEmpty() && operators.peek() != ')') {
                    reverseStack.push(operators.pop());
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) >= getPrecedence(token)) {
                    reverseStack.push(operators.pop());
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            reverseStack.push(operators.pop());
        }

        while (!reverseStack.isEmpty()) {
            prefix.append(reverseStack.pop());
        }

        return prefix.reverse().toString();
    }

    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        CustomStack operators = new CustomStack(infixExpression.length());

        for (int i = 0; i < infixExpression.length(); i++) {
            char token = infixExpression.charAt(i);

            if (isOperand(token)) {
                postfix.append(token);
                postfix.append(" ");
            } else if (token == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                    postfix.append(" ");
                }
                operators.pop();
            } else if (token == '(') {
                operators.push(token);
            } else {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) >= getPrecedence(token)) {
                    postfix.append(operators.pop());
                    postfix.append(" ");
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
            postfix.append(" ");
        }

        return postfix.toString();
    }

    public static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an infix expression: ");
        String infixExpression = scanner.nextLine();

        String prefixExpression = infixToPrefix(infixExpression);
        String postfixExpression = infixToPostfix(infixExpression);

        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);

        scanner.close();
    }
}
