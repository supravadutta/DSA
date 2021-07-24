import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 0 } };
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            stk.push(i);
        }
        while(stk.size()>=2)
        {
            int i=stk.pop();
            int j=stk.pop();
            if(arr[i][j]==1)
            {
                stk.push(j);
            }
            else{
                stk.push(i);
            }
        }
        int pot=stk.pop();
        for(int i=0;i<arr.length;i++)
        {
            if(i!=pot)
            {
                if(arr[i][pot]==0 || arr[pot][i]==1)
                {
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println("celebrity "+ pot);
    }
}