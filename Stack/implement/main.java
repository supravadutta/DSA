class Stack {
  int[] arr;
  int top = -1;
  int max = 0;

  Stack(int size) {
    this.arr = new int[size];
    this.max = size;
  }

  void push(int data) {
    if (top < max-1) {
      top++;
      arr[top] = data;

    } else {
      System.out.println("Stack is overflow condition");
    }
  }
  void pop(){
    if(top!=-1)
    {
      arr[top]=0;
      top--;
    }
    else{
      System.out.println("Stack is underflow condition");
    }
  }
  int peek(){
    if(top!=-1)
    {
      return arr[top];
    }
    else{
      return -1;
    }
  }
  boolean isEmpty(){
    if(top!=-1)
    {
      return true;
    }
    else{
      return false;
    }
  }
  int size(){
    return this.arr.length;
  }
  public static void main(String[] args) {
    Stack myStack = new Stack(5);
    myStack.push(7);
    myStack.push(1);
    myStack.push(2);
    myStack.push(9);
    myStack.push(4);
    myStack.push(23);
    int result=myStack.peek();
    System.out.println(result);
    myStack.pop();
    System.out.println(myStack.peek());
  }
}