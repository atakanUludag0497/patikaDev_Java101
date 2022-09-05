import java.util.Scanner;

public class HarmonicSayilariBulma {
    public static void main(String[] args) {
        int n;
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("N sayisi giriniz : ");
        n = input.nextInt();
        for(double i = 1; i <= n; i++){
            result = result + (1/i);
        }
        System.out.println("Harmonic Toplam = " + String.format("%.2f",result));
    }
}
