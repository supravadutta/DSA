import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Character> operator = new Stack<>();
        Stack<String> preorder = new Stack<>();
        Stack<String> postorder = new Stack<>();
        String exp = "a*b+c-d+(f*e)";
        for (int i = 0; i < exp.length(); i++) {
            char currChar = exp.charAt(i);
            if (currChar == '(') {
                operator.push(currChar);
            } else if (currChar == ')') {
                while (operator.peek() != '(') {
                    char op = operator.pop();
                    String val2 = preorder.pop();
                    String val1 = preorder.pop();
                    String value2 = postorder.pop();
                    String value1 = postorder.pop();
                    String temp_pre = op + val1 + val2;
                    String temp_post = value1 + value2 + op;
                    preorder.push(temp_pre);
                    postorder.push(temp_post);

                }
                operator.pop();
            } else if (currChar == '+' || currChar == '-' || currChar == '*' || currChar == '/') {
                while (operator.size() != 0 && Precedence(operator.peek()) >= Precedence(currChar)
                        && operator.peek() != '(') {
                    char op = operator.pop();
                    String val2 = preorder.pop();
                    String val1 = preorder.pop();
                    String value2 = postorder.pop();
                    String value1 = postorder.pop();
                    String temp_pre = op + val1 + val2;
                    String temp_post = value1 + value2 + op;
                    preorder.push(temp_pre);
                    postorder.push(temp_post);
                }
                operator.push(currChar);
            } else {
                preorder.push(String.valueOf(currChar));
                postorder.push(String.valueOf(currChar));
            }
         
        }
        if (operator.size()!=0) {
            while(operator.size()!=0)
            {
                char op = operator.pop();
                String val2 = preorder.pop();
                String val1 = preorder.pop();
                String value2 = postorder.pop();
                String value1 = postorder.pop();
                String temp_pre = op + val1 + val2;
                String temp_post = value1 + value2 + op;
                preorder.push(temp_pre);
                postorder.push(temp_post);
            }
            
        }
        System.out.println(preorder.peek());
        System.out.println();
        System.out.println(postorder.peek());
        
        

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

}