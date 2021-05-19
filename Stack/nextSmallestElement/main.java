import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 9, 11, 10, 2, 3, 1, 5 };
        int[] result = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if (stk.isEmpty()) {
                result[i] = -1;
                stk.push(arr[i]);
            } else {
                if (stk.peek() < arr[i]) {
                    result[i] = stk.peek();
                    stk.push(arr[i]);
                } else if (stk.peek() >= arr[i]) {
                    while (stk.peek() >= arr[i]) {
                        stk.pop();
                        if (stk.isEmpty()) {

                            break;
                        }

                    }
                    if (stk.isEmpty()) {
                        result[i] = -1;
                        stk.push(arr[i]);
                    } else {
                        result[i] = stk.peek();
                        stk.push(arr[i]);

                    }
                }
            }
        }
        for (int el : result) {
            System.out.println(el);
        }

    }
}
