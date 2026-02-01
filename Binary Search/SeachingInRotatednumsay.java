import java.util.*;

public class SeachingInRotatednumsay {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 8, -1, 0, 1, 2, 3 };
    System.out.println(search(nums));
  }

  static int search(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    while (start<end) {
      int mid = start + (end - start) / 2;


      if (nums[mid] > nums[end]) {
        start = mid+1;
      } else {
        end = mid;
      }
    }
    return nums[start];
  }

}
