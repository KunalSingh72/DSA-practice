public class PrintName {
  public static void main(String[] args) {
    
    String name = "Draco";
    int n = 8;
    printName(name, n);

  }
  static void printName(String name, int n){

    if(n<1){
      return;
    }
    System.out.println(n + " " + name);
    printName(name, n-1);

  }
}