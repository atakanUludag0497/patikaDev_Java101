import java.util.Scanner;


public class Ters_Ucgen {
    public static void main(String[] args) {
        int numberOfDigits;
        int temporaryNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        numberOfDigits = input.nextInt();
        temporaryNum = numberOfDigits;
        // girilen sayı kadar satır için olan for
        for(int i = 1; i <= numberOfDigits; i++){
            // bırakılacak boşluk hesabını yapan for
            for(int k = i; k >= 1; k--){
                System.out.print(" ");
            }
            // basılacak yıldız sayısını bulan for
            for(int j = temporaryNum*2-1; j >= 1; j--){
                System.out.print("*");
            }
            temporaryNum--;
            System.out.println();
        }
    }
}
