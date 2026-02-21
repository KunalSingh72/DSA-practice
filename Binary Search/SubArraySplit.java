public class SubArraySplit {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5};
    System.out.println(splitArray(arr, 2));
  }

  static int splitArray(int[] arr, int k) {
    int n = arr.length;
    if (k > n)
      return -1;

    int low = Integer.MIN_VALUE;
    int high = 0;
    for (int i : arr) {
      if (i > low)
        low = i;
      high += i;
    }

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int subArrays = countSubArrays(arr, n, mid);
      if (subArrays > k) {
        low = mid + 1;
      } else {

        high = mid - 1;
      }

    }
    return low;
  }

  static int countSubArrays(int[] arr, int n, int pages) {
    int subArrays = 1;
    int elements = 0;

    for (int i = 0; i < n; i++) {
      if (elements + arr[i] <= pages) {
        elements += arr[i];
      } else {
        subArrays++;
        elements = arr[i];
      }
    }
    return subArrays;
  }
}
