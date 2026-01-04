public class Count_Digit {
    public static void main(String[] args) {
        int n = 231232212; 
        int count = 0;

        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);

    }
}
