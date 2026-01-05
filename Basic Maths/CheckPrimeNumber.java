public class CheckPrimeNumber {
  public static void main(String[] args) {
    int num = 10;
    boolean flag = true;
    for(int i = 2; i <= num/2; i++){
      if(num%i==0){
        flag = false;
        break;
      }
    }
    System.out.println(flag);

  }
}
