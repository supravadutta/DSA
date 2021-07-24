import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix_exp = sc.next();
        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for (int i = 0; i < postfix_exp.length(); i++) {
            if (postfix_exp.charAt(i) == '0' || postfix_exp.charAt(i) == '1' || postfix_exp.charAt(i) == '2'
                    || postfix_exp.charAt(i) == '3' || postfix_exp.charAt(i) == '4' || postfix_exp.charAt(i) == '5'
                    || postfix_exp.charAt(i) == '6' || postfix_exp.charAt(i) == '7' || postfix_exp.charAt(i) == '8'
                    || postfix_exp.charAt(i) == '9') {
                value.push(postfix_exp.charAt(i)-'0');
                infix.push(postfix_exp.charAt(i)+"");
                prefix.push(postfix_exp.charAt(i)+"");
            } else {
                int b = value.pop();
                int a = value.pop();
                char op = postfix_exp.charAt(i);
                int calculate_value = calculate(a, b, op);
                value.push(calculate_value);
                String val2=infix.pop();
                String val1=infix.pop();
                String infix_result="("+val1+op+val2+")";
                infix.push(infix_result);
                String pre_val2=prefix.pop();
                String pre_val1=prefix.pop();
                String prefix_result=op+pre_val1+pre_val2;
                prefix.push(prefix_result);
               
            }
        }
        System.out.println(value.peek());
        System.out.println(infix.peek());
        System.out.println(prefix.peek());

    }

    static int calculate(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        }
       else if (op == '-') {
            return a - b;
        }
      else if (op == '*') {
            return a * b;
        }
        else if (op == '/') {
            return a / b;
        }
        return 0;
    }
}
