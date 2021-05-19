class Main {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        int rowstart = 0;
        int rowend = arr.length - 1;
        int colstart = 0;
        int colend = arr[0].length - 1;
        while (rowstart <= rowend && colstart <= colend) {
            for (int i = colstart; i <= colend; i++) {
                System.out.print(arr[rowstart][i] + " ");
            }
            rowstart++;
            for (int j = rowstart; j <= rowend; j++) {
                System.out.print(arr[j][colend] + " ");
            }
            colend--;
            if (rowstart <= rowend) {
                for (int k = colend; k >= colstart; k--) {
                    System.out.print(arr[rowend][k] + " ");
                }
                rowend--;
                if (colstart <= colend) {
                    for (int i = rowend; i >= rowstart; i--) {
                        System.out.print(arr[i][colstart] + " ");
                    }
                    colstart++;
                }
            }
        }
    }
}
