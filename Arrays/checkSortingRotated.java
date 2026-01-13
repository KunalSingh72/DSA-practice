public class checkSortingRotated {
  public static void main(String[] args) {
    
    int arr[] = {3,4,1,2};
    int count = 0;
    int n = arr.length;

    for (int i = 1; i < arr.length; i++) {
      if(arr[i-1] > arr[i]) count++;
    }
    if(arr[n-1] > arr[0]) count++;

    System.out.println(count<=1);
  }
}
