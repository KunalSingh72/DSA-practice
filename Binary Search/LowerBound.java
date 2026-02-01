public class LowerBound {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    System.out.println(searching(nums, 0, nums.length - 1, -1));
  }
  static int searching(int[] nums, int start, int end, int target) {
    int ans = nums.length;

    
    while(start<=end){
      int mid = (start+end)/2;
      
      if(nums[mid] >=target) {
        end = mid-1;
        ans = mid;
      } else {
        start = mid+1;
      }

    }
    return ans;

    }
}
