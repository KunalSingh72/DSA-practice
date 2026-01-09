public class Fibbonacci {
  static void fib(int a, int b, int n) {
        if (a > n) return;

        System.out.print(a + " ");
        fib(b, a + b, n);
    }

    public static void main(String[] args) {
        int n = 5000;
        fib(0, 1, n);
    }
}
