class Main {
  public static void main(String[] args) {
    String str = "geeks";
    char[] arr = new char[str.length()];
    arr = str.toCharArray();
    int flag = 0;
    int counter=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I'|| arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U')
      { 
        
        flag=1;
        
      }
      else{
        counter++;
      }
    }
    System.out.println(counter);
    if(flag==1)
    {
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  //   for (int i = 0; i < arr.length; i++) {
 

  //   //   if (arr[i] == 'e') {
  //   //     counter++;
  //   //   }

  //   // }
  //   // System.out.println(counter);
  // }
}
}
