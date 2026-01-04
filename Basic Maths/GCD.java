public class GCD {
    public static void main(String[] args) {
        
        int n1 = 340;
        int n2 = 20;
        int Gcd = 1;
        for(int i = 2; i <= n1 && i <= n2; i++){
            if(n1%i==0 && n2%i==0){
                Gcd = i; 
            }
        }
        
        System.out.println(Gcd);


    }
}
