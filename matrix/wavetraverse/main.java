class Main {
    public static void main(String[] args) {
        int[][] arr = { { 5, 1, 2, 4 }, { 7, 9, 0, 5 }, { 9, 4, 1, 7 } };
        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}