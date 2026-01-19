public class StockBuyAndSell {
  public static void main(String[] args) {
    int[] arr = { 7, 1, 5, 3, 6, 4 };

    System.out.println(looping(arr));
  }
  
  static int looping(int[] nums) {

    int n = nums.length;
    if(n<=1){
      return 0;
    }

    int buy = nums[0];
    int profit = 0;
    for(int i = 1; i < n; i++){
      if(buy > nums[i]){
        buy = nums[i];
      }
      profit = Math.max(profit, nums[i] - buy);
    }
    return profit;
  }
}
