public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 2722;
        int sum = 0;
        int original_num = n;
        while(n>0){
            int rem = n%10;
            sum = sum*10 + rem;
            n/=10; 
        }

        if(original_num == sum){
            System.out.println(true);
        } else { 
            System.out.println(false);
        }

    }
}
