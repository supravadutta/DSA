import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 13, 7, 9, 10, 12, 8 };
        int[] stock = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stock[i] = i + 1;
                stk.push(i);
            } else {
                if (arr[stk.peek()] > arr[i]) {
                    stock[i] = i - stk.peek();
                    stk.push(i);
                } else {
                    while (arr[stk.peek()] < arr[i]) {
                        stk.pop();
                        if (stk.isEmpty()) {
                            break;
                        }
                    }
                    if (stk.isEmpty()) {
                        stock[i] = i + 1;
                    } else {
                        stock[i] = i - stk.peek();
                        stk.push(i);
                    }
                }
            }
        }
        for (int el : stock) {
            System.out.print(el + " ");
        }

    }
}