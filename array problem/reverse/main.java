class Main {
  public static void main(String[] args) {
    String str = "geeks";
    char[] arr = new char[str.length()];
    arr = str.toCharArray();
    int first = 0;
    int last = str.length() - 1;
    while (first < last) {
      char temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;

    }
    String result = String.valueOf(arr);
    System.out.println(result);
  }
}
