import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        // Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        // 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz :");
        yil = input.nextInt();
        if(yil % 400 == 0 || yil % 4 == 0){
            System.out.println(yil + " bir artik yildir !");
        }else {
            System.out.println(yil + " bir artik yil degildir...");
        }
    }
}
