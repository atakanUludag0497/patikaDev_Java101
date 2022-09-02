import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        n = input.nextInt();
        do{
            if(n % 2 == 1){
                toplam += n;
            }
            n--;
        }while(n > 0);
        System.out.println("Tek sayilarin toplami = " + toplam);
        System.out.println("Negatif bir sayi girilene kadar toplama yapilir :");
        do{
            System.out.println("Toplamak icin tek bir sayi giriniz :");
            n = input.nextInt();
            if(n % 2 == 1){
                toplam += n;
            }
            System.out.println("Toplam = " + toplam);
        }while(n > 0);
        System.out.println("Girilen sayi --> " + n);
        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        do{
            System.out.println("Sayi giriniz : ");
            n = input.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                toplam += n;
            }
            System.out.println("Toplam = " + toplam);
        }while(n % 2 == 1);
    }
}
