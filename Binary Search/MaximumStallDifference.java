import java.util.Arrays;

public class MaximumStallDifference {
  public static void main(String[] args) {
    int stalls[] = { 4, 2, 1, 3, 6 };
    int cows = 2;
    System.out.println(myApproach(stalls, cows));
  }

  static int myApproach(int[] stalls, int cows){
    
    Arrays.sort(stalls);

    int low = 1; 
    int high = stalls[stalls.length-1] - stalls[0];
    int ans = 0;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (canPlace(stalls, cows, mid)) {
        ans=mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return ans;
  }
  static boolean canPlace(int[] stalls, int cows, int d) {
    int count = 1;
    int lastPos = stalls[0];

    for (int i = 1; i < stalls.length; i++) {
      // If stall is at least d away from last placed cow
      if (stalls[i] - lastPos >= d) {
        // Place cow here
        count++;
        // Update last position
        lastPos = stalls[i];
      }
      // If all cows are placed successfully
      if (count >= cows)
        return true;
    }

    return false;
  }
}
