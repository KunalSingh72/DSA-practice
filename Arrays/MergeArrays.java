import java.util.Arrays;

public class MergeArrays {
  public static void main(String[] args) {

    int[] arr1 = { 1, 2, 3, 0, 0, 0};
    int[] arr2 = { 2, 5, 6};

    solution(arr1, 3, arr2, arr2.length);

    System.out.println(Arrays.toString(arr1));
  }
  static void solution(int[] nums1, int m, int[] nums2, int n) {

    int r = m+n-1;
    int i = m-1;
    int j = n-1;
    while(i>=0 && j>=0) {
      if(nums1[i] >= nums2[j]) {
        nums1[r--] = nums1[i];
        i--;
      } else if(nums1[i] < nums2[j]) {
        nums1[r--] = nums2[j];
        j--;
      }
    }
    while (i >= 0) {
      nums1[r] = nums1[i];
      r--;
      i--;
    }

    while (j >= 0) {
      nums1[r] = nums2[j];
      r--;
      j--;
    }
}
}