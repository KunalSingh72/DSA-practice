public class PrintNumber {
  public static void main(String[] args) {
    
    int n = 8;
    printNumForward(1, n);
    // printNumBackward( n);

  }
  static void printNumForward(int current, int n){

    if(current > n){
      return;
    }
    System.out.print(current + " ");
    printNumBackward(n-current+1);
    printNumForward(current+1, n);
  }

  static void printNumBackward(int n){

    if(n <= 0){
      return;
    }
    System.out.println(n);
    // printNumBackward(n-1);
  }
}
