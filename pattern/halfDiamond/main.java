class Main {
  public static void main(String[] args) {
    int num = 7;
    int end = 1;
    int mid = num / 2 + 1;
    for (int row = 1; row <= num; row++) {
      if (row < mid) {
        for (int col = 1; col <= num; col++) {
          if (col <= end) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }

        }
        end++;
      } else if (row >= mid) {
        for (int col = 1; col <= num; col++) {
          if (col <= end) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        end--;
      }
      System.out.println();

    }
    
  }
}
