import java.util.Scanner;

public class Fibonacci_Serisi {
    public static void main(String[] args) {
        int numOfelementsFibonacci;
        int fibonacciSum = 0;
        int lastNum = 1;
        int containerNum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz : ");
        numOfelementsFibonacci = input.nextInt();
        for(int i = 0; i <= numOfelementsFibonacci; i++){
            fibonacciSum = containerNum + lastNum;
            System.out.println(containerNum + " + " + lastNum + " = " + fibonacciSum);
            containerNum = lastNum;
            lastNum = fibonacciSum;
        }
    }
}
