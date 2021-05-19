import java.util.*;
class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    Stack<Character>stk=new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)!=')')
        {
            stk.push(str.charAt(i));
        }
        else{
            if(stk.peek()=='(')
            {
                System.out.println("True");
                return;
            }
            else{
                while(stk.peek()!='(')
                {
                    stk.pop();
                }
                stk.pop();
            }
        }
    }
    }
}