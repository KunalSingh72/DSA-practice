public class SmallestDivisor {
  public static void main(String[] args) {
    int[] arr = { 44, 22, 33, 11, 1 };
    System.out.println(myApproach(arr, 5));
  }

  static int myApproach(int[] nums, int threshold) {
    if (nums.length > threshold)
      return -1;

    int low = 1;
    int high = Integer.MIN_VALUE;
    for (int i : nums) {
      high = Math.max(high, i);
    }

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (calculateSum(nums, mid) <= threshold) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }

  static int calculateSum(int[] arr, int divisor) {
    int sumOfDivisor = 0;
    for (int i : arr) {
      sumOfDivisor += (i + divisor - 1) / divisor;
    }

    return sumOfDivisor;
  }
}
