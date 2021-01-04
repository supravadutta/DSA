import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] arr = str.toCharArray();
    Stack<Character> stck = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '(') {
        stck.push(arr[i]);
      } else if (arr[i] == ')') {
        if (stck.isEmpty()) {
          stck.push(arr[i]);
        } else {
          stck.pop();
        }
      }
    }
    if (stck.isEmpty()) {
      System.out.println("valid");
    } else {
      System.out.println("Invalid");
    }

  }
}