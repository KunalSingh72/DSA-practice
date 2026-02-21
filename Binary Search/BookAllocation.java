public class BookAllocation {
  public static void main(String[] args) {
    int[] arr = { 25, 46, 28, 49, 24 };
    System.out.println(findPages(arr, arr.length, 4));
  }

  static int findPages(int[] arr, int n, int m) {
    if (m > n)
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
      int students = countStudents(arr, mid);
      if (students > m) {
        low = mid + 1;
      } else {

        high = mid - 1;
      }

    }
    return low;
  }

  static int countStudents(int[] arr, int pages) {
    int n = arr.length;
    int students = 1;
    int pagesStudent = 0;

    for (int i = 0; i < n; i++) {
      if (pagesStudent + arr[i] <= pages) {
        pagesStudent += arr[i];
      } else {
        students++;
        pagesStudent = arr[i];
      }
    }
    return students;
  }
}
