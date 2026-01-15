public class MaximumConsecutiveOnes {
  static int findMaxConsecutiveOnes(int[] nums) {
    int sum1 = 0, sum2 = 0;
    for (int i : nums) {
      if (i == 1) {
        sum1++;
      } else {
        if (sum1 > sum2) {
          sum2 = sum1;
        }
        sum1 = 0;
      }
    }
    if (sum1 > sum2)
      sum2 = sum1;
    return sum2;
  }
  public static void main(String[] args) {
    int[] arr = {0,1,1,0,1,1,0,1,1,1};
    System.out.println(findMaxConsecutiveOnes(arr));
  }
}
