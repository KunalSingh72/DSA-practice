public class BinarySearching {
  public static void main(String[] args) {
    int[] nums = {1,2,3,5,6};
    System.out.println(searching(nums, 0, nums.length-1, 4));


  }
  static int searching(int[] nums, int start, int end, int target) {
        if(start > end) return start;

        int mid = (start + end)/2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return searching(nums, mid+1, end, target);
        else return searching(nums, start, mid-1, target);

    }
}