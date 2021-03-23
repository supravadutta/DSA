class Main {
  public static void main(String[] args) {
    int[] arr = { 73, 67, 38, 33 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 5 != 0) {
        int rem = (arr[i] / 5);
        rem = (rem + 1) * 5;
        if (rem >= 40) {
          if (Math.abs(arr[i] - rem) < 3) {
            arr[i] = rem;
          }

        }
      }
    }
    System.out.println("final marks..");
    for (int el : arr) {
      System.out.println(el);
    }
  }
}
