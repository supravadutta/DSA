import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    boolean vacation = sc.nextBoolean();
    String result = alarmClock(day, vacation);
    System.out.println(result);

  }

  public static String alarmClock(int day, boolean vacation) {
    if (day == 0) {
      return "10:00";
    } else {
      if (vacation == true) {
        return "10:00";
      } else {
        return "7:00";
      }
    }
  }
}
