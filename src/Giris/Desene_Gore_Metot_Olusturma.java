import java.util.Scanner;

public class Desene_Gore_Metot_Olusturma {
    static void designedMethod(int number){
        System.out.print(number + " ");
        if(number <= 0)
            return;
        designedMethod(number - 5);
        System.out.print(number + " ");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir 'n' sayisi giriniz : ");
        int sayi = input.nextInt();
        designedMethod(sayi);
    }
}