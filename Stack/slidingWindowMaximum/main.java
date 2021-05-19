import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = { 12, 9, 11, 10, 2, 3, 1, 5 };
        int n = (arr.length - (k - 1));
        int[] max = new int[n];
        int nge[] = new int[arr.length];
        nge = nextGreater(arr);
        for (int i = 0; i <= arr.length - k; i++) {
            int j = i;
            while (nge[j] < i + k) {
                j = nge[j];
            }
            max[i] = arr[j];
        }
        for (int el : max) {
            System.out.print(el + " ");
        }
        System.out.println();
        for(int ele:nge)
        {
            System.out.print(ele+" ");
        }

    }

    static int[] nextGreater(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                output[i] = arr.length;
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
                        output[i] = arr.length;
                    } else {
                        output[i] = stk.peek();
                    }
                    stk.push(i);
                } else if (arr[i] < arr[stk.peek()]) {
                    output[i] = stk.peek();
                    stk.push(i);
                }
            }
        }
        return output;
    }
}
