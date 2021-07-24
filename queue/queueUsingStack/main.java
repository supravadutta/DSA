import java.util.Stack;

class Main{
    public static void main(String[] args) {
        Stack<Integer>stk1=new Stack<>();
        Stack<Integer>stk2=new Stack<>();
        enque(stk1, 5);
        enque(stk1, 8);
        enque(stk1, 11);
        deque(stk1, stk2);
        System.out.println(stk1);

    }
    static void enque(Stack<Integer>stk1,int el)
    {
        stk1.push(el);
    }
    static void deque(Stack<Integer>stk1,Stack<Integer>stk2)
    {
        while(stk1.size()!=0)
        {
            int pop_num=stk1.pop();
            stk2.push(pop_num);
        }
        stk2.pop();
        while(stk2.size()!=0)
        {
            int num=stk2.pop();
            stk1.push(num);
        }
    }
}