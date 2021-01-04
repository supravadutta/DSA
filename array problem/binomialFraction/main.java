import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float n = sc.nextFloat();
    float r = sc.nextFloat();
    float value = factorial(n) / (factorial(r) * factorial(n - r));
    System.out.println(value);
  }

  static float factorial(float value) {
    float fact = 1;
    for (float i = 1; i <= value; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
