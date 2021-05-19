import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
        Stack<Integer> stk = new Stack<>();
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                output[i] = -1;
                stk.push(arr[i]);
            } else {
                if (arr[i] >= stk.peek()) {
                    while (arr[i] > stk.peek()) {
                        stk.pop();
                        if (stk.isEmpty()) {
                            break;
                        }
                    }
                    if (stk.isEmpty()) {
                        output[i] = -1;
                    } else {
                        output[i] = stk.peek();
                    }
                    stk.push(arr[i]);
                } else if (arr[i] < stk.peek()) {
                    output[i] = stk.peek();
                    stk.push(arr[i]);
                }
            }
        }
        for (int el : output) {
            System.out.println(el);
        }
    }
}
