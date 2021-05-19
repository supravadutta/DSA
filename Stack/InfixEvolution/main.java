import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        String exp = "2+(5-3*6/2)";
        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);
            if (currentChar == '(') {
                operators.push(currentChar);
            } else if (currentChar == ')') {
                while (operators.peek() != '(') {
                    char currOp = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int cal = operation(value1, value2, currOp);
                    operands.push(cal);
                }
                operators.pop();

            } else if (Character.isDigit(currentChar)) {
                operands.push(currentChar - '0');
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                while (operators.size() != 0 && operators.peek() != '('
                        && Precedence(operators.peek()) >= Precedence(currentChar)) {
                    char currOp = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int cal = operation(value1, value2, currOp);
                    operands.push(cal);
                }
                operators.push(currentChar);
            }
        }
        System.out.println(operands.peek());

    }

    static int Precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    static int operation(int value1, int value2, char operator) {
        if (operator == '*') {
            return value1 * value2;
        } else if (operator == '+') {
            return value1 + value2;
        } else if (operator == '-') {
            return value1 - value2;
        } else if (operator == '/') {
            return value1 / value2;
        } else {
            return 0;
        }
    }
}
