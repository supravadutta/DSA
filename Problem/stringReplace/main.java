class Main{
  public static void main(String[] args) {
    String str = "hi computer";
    String replace = "hey";
    String[]arr=str.split(" ");
    int index=0;
    String result="";
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]=="hi")
      {
        index=i;
        break;
      }
    }
    arr[index]=replace;
    for(int j=0;j<arr.length;j++)
    {
      result=result+arr[j]+" ";
    }
    System.out.println(result);
  }
}