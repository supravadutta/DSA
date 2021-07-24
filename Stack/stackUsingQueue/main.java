import java.util.*;
class Main{
    public static void main(String[] args) {
        Queue<Integer>que1=new LinkedList<>();
        Queue<Integer>que2=new LinkedList<>();
        push_stk(2, que1);
        push_stk(3, que1);
        push_stk(8, que1);
        pop_stk(que1, que2);
        System.out.println(que1);


    }
    static void push_stk(int el,Queue<Integer>que1)
    {
        que1.add(el);
    } 
    static void pop_stk(Queue<Integer>que1,Queue<Integer>que2)
    {
        while(que1.size()>1)
        {
            int temp=que1.remove();
            que2.add(temp);
        }
        que1.remove();
        while(que2.size()!=0)
        {
            int temp_new=que2.remove();
            que1.add(temp_new);
        }
    }
}
