import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] arr = str.toCharArray();
    Stack<Character> stk = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
        stk.push(arr[i]);
      } else if(arr[i]==')')
      {
        if(stk.isEmpty())
        {
          stk.push(arr[i]);
        }
        else{
          if(stk.peek()=='(')
          {
            stk.pop();
          }
          else{
            stk.push(arr[i]);
          }
        }
      }
      else if(arr[i]=='}')
      {
        if(stk.isEmpty())
        {
          stk.push(arr[i]);
        }
        else{
          if(stk.peek()=='{')
          {
            stk.pop();
          }
          else{
            stk.push(arr[i]);
          }
        }
      }
      else if(arr[i]==']')
      {
        if(stk.isEmpty())
        {
          stk.push(arr[i]);
        }
        else{
          if(stk.peek()=='[')
          {
            stk.pop();
          }
          else{
            stk.push(arr[i]);
          }
        }
      }
    }
    if (stk.isEmpty()) {
      System.out.println("valid");
    } else {
      System.out.println("Invalid");
    }

  }
}
