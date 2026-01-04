public class ReverseNumber {
    public static void main(String[] args) {
        int x = 277282233;
        int ans = 0; // Initialize the reversed number to 0
        while (x != 0) {
            int digit = x % 10; // Get the last digit of x
            
            // Check for overflow/underflow before updating ans
            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                System.out.println(0);; // Return 0 if reversing x would cause overflow/underflow
            }
            
            ans = ans * 10 + digit; // Append the digit to the reversed number
            x = x / 10; // Remove the last digit from x
        }
        System.out.println(ans); // Return the reversed number
    }
}
