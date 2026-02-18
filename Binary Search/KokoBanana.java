import java.util.Arrays;

public class KokoBanana {
  public static void main(String[] args) {
    int[] piles = { 3, 6, 7, 11 };
    // System.out.println(bruteForceApproach(piles, 8));
    System.out.println(optimalApproach(piles, 8));
  }

  static int optimalApproach(int[] piles, int h) {
    int maxPile = Arrays.stream(piles).max().getAsInt();
    int low = 1;
    int high = maxPile;
    int ans = maxPile;
    while (low <= high) {
      int mid = (high + low) / 2;

      int hours = calculateHours(piles, mid);

      if (hours <= h) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  // static int bruteForceApproach(int[] piles, int h) {

  //   int maxPile = Arrays.stream(piles).max().getAsInt();

  //   for (int i = 1; i <= maxPile; i++) {
  //     int hours = calculateHours(piles, i);

  //     if (hours <= h)
  //       return i;
  //   }
  //   return maxPile;
  // }

  static int calculateHours(int[] piles, int hourly) {
    int totalHours = 0;
    for (int pile : piles) {
      totalHours += (int) Math.ceil((double) pile / hourly);
    }
    return totalHours;
  }
}
