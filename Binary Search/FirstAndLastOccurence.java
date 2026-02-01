import java.util.*;
public class FirstAndLastOccurence {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 4, 5, 5, 5, 6 };
    System.out.println(Arrays.toString(new int[] { first(nums, 5), last(nums, 5) }));
  }

  static int first(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        ans = mid;
        end = mid - 1;
      } else if (nums[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return ans;
  }

  static int last(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int ans = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        ans = mid;
        start = mid + 1;
      } else if (nums[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return ans;
  }
}
