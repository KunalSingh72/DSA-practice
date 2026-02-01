import java.util.*;

public class CountOccurence {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 4, 5, 5, 5, 5, 6 };
    System.out.println(count(nums, 7));
  }

  static int count(int[] nums, int target) {
    int[] ans = firstAndLastOccurence(nums, target);
    if (ans[0] == -1)
      return -1;
    return ans[1] - ans[0] + 1;
  }

  static int[] firstAndLastOccurence(int[] nums, int target) {
    int first = first(nums, target);
    if (first == -1)
      return new int[] { -1, -1 };
    int last = last(nums, target);
    return new int[] { first, last };
  }

  static int first(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int first = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        first = mid;
        end = mid - 1;
      } else if (nums[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return first;
  }

  static int last(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int last = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        last = mid;
        start = mid + 1;
      } else if (nums[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return last;
  }

}
