class Main {
  public static void main(String[] args) {
    String str = "07:05:45PM";
    System.out.print(convert(str));

  }

  static String convert(String str) {
    String hr = str.substring(0, 2);
    String min = str.substring(2, 8);
    String last = str.substring(8, 10);
    int hrs = Integer.valueOf(hr);
    if (hrs == 12 && last.equals("PM")) {
      return (hr + min);
    } 
    else if (hrs == 12 && last.equals("AM")) {
      hr = "00";
      return (hr + min);
    } 
    else if (last.equals("PM")) {
      hrs = hrs + 12;
      hr = String.valueOf(hrs);
      return (hr + min);
    }
    return(hr+min);
  }
}
