public class GCD {
    public static void main(String[] args) {
        
        int n1 = 34000;
        int n2 = 20;

        // approach 1
        int Gcd = 1;
        for(int i = 1; i <= n1 && i <= n2; i++){
            if(n1%i==0 && n2%i==0){
                Gcd = i; 
            }
        }
        
        System.out.println(Gcd);

        // approach 2
        Gcd = 1;
        int minNum = Math.min(n1, n2);

        for(int i = minNum; i > 0; i--){
            if(n1%i==0 && n2%i==0){
                Gcd = i; 
                break;
            }
        }
        System.out.println(Gcd);

        //approach 3
        while(n1 > 0 && n2 > 0){            
            if(n1 > n2){
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        System.out.println(n1!=0?n1:n2);

    }
}
