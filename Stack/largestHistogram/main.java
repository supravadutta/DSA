import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int[] arr = { 15, 8, 10, 5, 10, 3, 2, 17 };
        int span;
        int max = -1;
        int[] lmg = new int[arr.length];
        int[] rmg = new int[arr.length];
        lmg = lmg(arr);
        rmg = rmg(arr);
        for (int i = 0; i < arr.length; i++) {
            if (lmg[i] == -1 && rmg[i] == -1) {
                span = 1;

            } else if (rmg[i] == -1) {
                span = i - lmg[i] + 1;
            } else if (lmg[i] == -1) {
                span = rmg[i] - i + 1;
            } else {
                span = rmg[i] - lmg[i] + 1;

            }
            int temp = span * arr[i];
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);

    }

    static int[] lmg(int[] arr) {
        int[] left = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                left[i] = -1;
                stk.push(i);
            } else {
                if (arr[stk.peek()] > arr[i]) {
                    left[i] = stk.peek();
                    stk.push(i);
                } else {
                    while (arr[stk.peek()] <= arr[i]) {
                        stk.pop();
                        if (stk.isEmpty()) {
                            break;
                        }
                    }
                    if (stk.isEmpty()) {
                        left[i] = -1;
                    } else {
                        left[i] = stk.peek();
                        stk.push(i);
                    }
                }
            }
        }
        return left;
    }

    static int[] rmg(int[] arr) {
        int[] right = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                right[i] = -1;
                stk.push(i);
            } else {
                if (arr[i] >= arr[stk.peek()]) {
                    while (arr[i] >= arr[stk.peek()]) {
                        stk.pop();
                        if (stk.isEmpty()) {
                            break;
                        }
                    }
                    if (stk.isEmpty()) {
                        right[i] = -1;
                    } else {
                        right[i] = stk.peek();
                    }
                    stk.push(i);
                } else if (arr[i] < arr[stk.peek()]) {
                    right[i] = stk.peek();
                    stk.push(i);
                }
            }
        }
        return right;
    }
}
