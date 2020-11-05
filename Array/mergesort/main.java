class Main{
  static void merge(int arr[],int l,int m,int h)
  {
    int n1=m-l+1;
    int n2=h-m;
    int L[]=new int[n1];
    int R[]=new int[n2];
    for(int i=0;i<n1;i++)
    {
      L[i]=arr[l+i];
  
    }
    for(int j=0;j<n2;j++){
      R[j]=arr[m+1+j];
    }
    int i=0,j=0;
    int k=l;
    while(i<n1 && j<n2)
    {
      if(R[j]<L[i])
      {
        arr[k]=R[j];
        j++;
        k++;
      }
      else if(L[i]<R[j])
      {
        arr[k]=L[i];
        i++;
        k++;
      }
    }
    while(i<n1){
      arr[k]=L[i];
      i++;
      k++;
    }
    while(j<n2)
    {
      arr[k]=R[j];
      j++;
      k++;
    }
  }
  static void MergeSort(int arr[],int l,int h)
  {
    if(l<h)
    {
      int m=((l+h)/2);
      MergeSort(arr,l,m);
      MergeSort(arr, m+1, h);
      merge(arr, l, m, h);

    }
  }
  public static void main(String[] args) {
    int array[]={12,11,13,5,6,7};
    System.out.println("array elements..");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + ",");

    }
    MergeSort(array, 0, array.length-1);
    System.out.println("sorted array..");
    System.out.println();
    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + ",");
    }
   
  }
}
