import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibo(int n){
        if(n == 1 || n == 2)
            return 1;
        return fibo(n-1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir n sayisi giriniz : ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}
