import java.util.*;

public class consecutiveElements {
  public static void main(String[] args) {
    
    int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    System.out.println(optimalApproach(nums));
    
  }
  static int optimalApproach(int[] nums){

    int n = nums.length;
    if(n == 0) return 0;
    if (n == 1) return 1;

    Set<Integer> s = new HashSet<>();
    for(int i=0; i<n; i++){
        s.add(nums[i]);
    }

    int maxxCnt = 1;
    for(int i: s){
      if(!s.contains(i-1)){
        int cnt = 1;
        int x = i;
        while(s.contains(x+1)){
          cnt++;
          x++;
        }
        maxxCnt = Math.max(cnt, maxxCnt); 
      }
    }
    return maxxCnt;
  }


  static int bruteForce(int nums[]){

    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    int startEle = nums[0];
    int cnt = 1;
    int maxCons = cnt;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == (startEle + 1)) {
        cnt++;
        startEle = nums[i];
      } else if (nums[i] == startEle) {
        continue;
      } else {
        startEle = nums[i];
        maxCons = Math.max(maxCons, cnt);
        cnt = 1;
      }
    }
    maxCons = Math.max(maxCons, cnt);

    return maxCons;

  }
}
