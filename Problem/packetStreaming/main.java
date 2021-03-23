class Main {
  static int nearestSquare(int value) {
    int temp = 1;
    int n = 0;
    while (temp <= value) {
      n++;
      temp = (int) Math.pow(2.00, Double.valueOf(n));
    }
    temp = temp / 2;
    return temp;
  }

  public static void main(String[] args) {
    int[] arr = { 17, 5, 8, 6, 12 };
    int rem = 0;
    int newElement = 0;
    int max = 0;
    for (int el : arr) {
      newElement = rem + el;
      rem = (newElement - nearestSquare(newElement));
      max = Math.max(max, nearestSquare(newElement));

    }
    System.out.print(max);
  }

}
