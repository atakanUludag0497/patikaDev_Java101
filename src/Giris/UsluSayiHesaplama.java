import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int ussuAlinacakSayi,usOlacakSayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Ussu alinacak sayiyi giriniz : ");
        ussuAlinacakSayi = input.nextInt();
        System.out.println("Us olacak sayiyi giriniz : ");
        usOlacakSayi = input.nextInt();
        int total = 1;
        // 3^4 = 3 * 3 * 3 * 3
        int i = 1;
        while(i <= usOlacakSayi){
            total *= ussuAlinacakSayi;
            i++;
        }
        System.out.println("Sonuc = " + total);
        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        System.out.println("* * * * For dongusu ile * * * *");
        total = 1;
        for(int j = 1; j <= usOlacakSayi; j++){
            total *= ussuAlinacakSayi;
        }
        System.out.println("For dongusu ile yapilan sonuc = " + total);
    }
}
