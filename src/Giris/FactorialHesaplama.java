import java.util.Scanner;

public class FactorialHesaplama {
    public static void main(String[] args) {
        int total = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz : ");
        int sayi = input.nextInt();
        for(int i = 1; i <= sayi; i++){
            System.out.print(" x " + i);
            total = total * i;
        }
        System.out.println(" = " + total);
        // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
        // farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        // N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        // Kombinasyon formülü
        // C(n,r) = n! / (r! * (n-r)!)
        System.out.println("* * * * Kombinasyon hesabi * * * *");
        int n,r;
        System.out.println("Birinci kumenin eleman sayisini giriniz : ");
        n = input.nextInt();
        System.out.println("Ikinci kumenin eleman sayisini giriniz : ");
        r = input.nextInt();
        if(n < 0 || r < 0 || n < r){
            System.out.println("Lutfen pozitif bir tam sayi giriniz !");
            System.out.println("Birinci kumenin eleman sayisi ikinci kumenin eleman sayisindan fazla olmalidir.");
        }else{
            int nf = 1;
            int rf = 1;
            for(int k = 1; k <= n; k++){
                nf = nf * k;
            }
            for(int j = 1; j <= r; j++){
                rf = rf * j;
            }
            int nrf = n - r;
            int fnrf = 1;
            for(int u = 1; u <= nrf; u++){
                fnrf = fnrf * u;
            }
            int combinasyon = nf / (rf * fnrf);
            System.out.println("Kombinasyon sonucu = " + combinasyon);
        }

    }
}
