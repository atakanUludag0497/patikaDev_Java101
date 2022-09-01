import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        k = input.nextInt();
        System.out.println("* * * * Cift Sayilar * * * *");
        for(int i = 1; i <= k; i++){
            if(i % 2 == 0){
                System.out.print(i + "-");
            }
        }
        System.out.println(" ");
        System.out.println("* * * * Tam bolunen 3 ve 4 icin sayilar * * * *");
        for(int j = 0; j <= k; j++){
            if(j % 3 == 0 && j % 4 == 0){
                System.out.print(j + "-");
            }
        }
    }
}
