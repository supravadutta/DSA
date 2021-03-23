class Main {
  public static void main(String[] args) {
    String str = "This is a large sentence";
    String arr[] = str.split(" ");
    int max = 0;
    String result = "";
    for (String el : arr) {
      if (el.length() > max) {
        max = el.length();
        result = el;
      }
    }
    System.out.println(max);
    System.out.println(result);
  }
}
