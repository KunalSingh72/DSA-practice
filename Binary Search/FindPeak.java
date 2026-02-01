public class FindPeak {

  public static void main(String[] args) {
    int[] nums = {1,2};
    System.out.println(searching(nums, 0, nums.length - 1));
  }

  static int searching(int[] nums, int start, int end) {

    while (start < end) {
      int mid = (start + end) / 2;

      if (nums[mid] > nums[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }

    }
    return start;
  }
}