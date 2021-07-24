import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[][] = { { 22, 28 }, { 1, 8 }, { 25, 27 }, { 14, 19 }, { 27, 30 }, { 5, 12 } };
        Pair timeSheet[] = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            timeSheet[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(timeSheet, new sortbyst());

        Stack<Pair> stk = new Stack<>();
        Stack<Pair> result = new Stack<>();
        for (int i = 0; i < timeSheet.length; i++) {
            if (i == 0) {
                stk.push(timeSheet[i]);
            } else {
                Pair previous = stk.pop();
                Pair current = timeSheet[i];
                if (current.st <= previous.et) {
                    previous.et = Math.max(previous.et, current.et);
                    stk.push(previous);
                } else {
                    stk.push(previous);
                    stk.push(current);
                }
            }
        }
        System.out.println(stk.size());
        while (stk.size() != 0) {
            result.push(stk.pop());
        }
        while (result.size() > 0) {
            Pair temp = result.pop();
            System.out.println(temp.st + " " + temp.et);

        }

    }
}

class Pair {
    int st;
    int et;

    Pair(int st, int et) {
        this.st = st;
        this.et = et;
    }

}

class sortbyst implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return a.st - b.st;
    }
}
