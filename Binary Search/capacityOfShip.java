public class capacityOfShip {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(myApproach(arr, 5));
  }

  static int myApproach(int[] nums, int days) {

    int low = Integer.MIN_VALUE;
    for (int i : nums) {
      low = Math.max(low, i);
    }
    int high = 0;
    for (int j : nums) {
      high += j;
    }

    while (low < high) {
      int mid = low + (high - low) / 2;

      if (calculateDays(nums, mid) <= days) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    return low;
  }

  static int calculateDays(int[] arr, int capacity) {
    int days = 1;

    int current = 0;
    for (int i : arr) {
      current += i;
      if (current > capacity) {
        days++;
        current = i;
      }
    }
    return days;

  }

}
