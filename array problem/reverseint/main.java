class Main{
  public static void main(String[] args) {
    int number = 12345;
    String str = String.valueOf(number);
    char[]arr=new char[str.length()];
    arr=str.toCharArray();
    int first = 0;
    int last = str.length() - 1;
    while (first < last) {
      char temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;
  }
  String result=String.valueOf(arr);
  int value=Integer.valueOf(result);
  System.out.println(value);
}
}
