public class SumOfNumber {
  public static void main(String[] args) {
    
    int n = 1;
    System.out.println(summation(n));

  }
  static int summation(int n){

    if(n<1){
      return 0;
    }

    return n + summation(n-1);
  }
}
