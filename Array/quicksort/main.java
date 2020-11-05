class Main {
  static void QuickSort(int arr[], int high, int low) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      QuickSort(arr, pivot - 1, low);
      QuickSort(arr, high, pivot);
    }
  }

  static int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 7, 8, 9, 1, 5 };
    System.out.println("array element..");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
    QuickSort(arr, arr.length - 1, 0);
    System.out.println();
    System.out.println("sorted array");
    for (int el : arr) {
      System.out.print(el + ",");
    }

  }
}
