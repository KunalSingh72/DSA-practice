import java.util.Arrays;

public class SortColors {
  public static void main(String[] args) {
    int[] nums = { 1, 0, 0, 2, 1 };

    // bruteForce(nums);
    optimalApproach(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void bruteForce(int[] nums) {
    int count0 = 0, count1 = 0, count2 = 0;

    for (int i : nums) {
      if (i == 0)
        count0++;
      else if (i == 1)
        count1++;
      else
        count2++;
    }

    int index = 0;
    while (count0-- > 0)
      nums[index++] = 0;

    while (count1-- > 0)
      nums[index++] = 1;

    while (count2-- > 0)
      nums[index++] = 2;

  }

  static void optimalApproach(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;

    while (mid <= high) {
      if (nums[mid] == 0) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
        low++;
        mid++;
      } else if (nums[mid] == 1) {
        mid++;
      } else {
        int temp = nums[high];
        nums[high] = nums[mid];
        nums[mid] = temp;
        high--;
      }
    }

  }
}
