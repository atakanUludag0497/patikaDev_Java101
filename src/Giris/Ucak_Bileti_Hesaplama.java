
import java.util.Scanner;

public class Ucak_Bileti_Hesaplama {
    public static void main(String[] args) {
        int mesafe,yas;
        char yolculuk_Tipi;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi Km cinsinden giriniz : ");
        mesafe = input.nextInt();
        System.out.println("Yasinizi giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ) : ");
        yolculuk_Tipi = input.next().charAt(0);

        double normalTutar,yasIndirimOrani,yasIndirimi,indirimliTutar = 0.0,gidisDonusBiletIndirimi,toplamTutar = 0.0;

        if(mesafe > 0 && yas > 0 && (yolculuk_Tipi == '1' || yolculuk_Tipi == '2')){
            //System.out.println("Veriler dogru girildi !");
            normalTutar = mesafe * 0.10;
            if(yas < 12){
                yasIndirimOrani = 0.50;
                yasIndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasIndirimi;
            }else if(yas > 12 && yas < 24){
                yasIndirimOrani = 0.10;
                yasIndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasIndirimi;
            }else if(yas > 65){
                yasIndirimOrani = 0.30;
                yasIndirimi = normalTutar * yasIndirimOrani;
                indirimliTutar = normalTutar - yasIndirimi;
            }else{
                // no discount applied
                indirimliTutar = normalTutar;
            }
            if(yolculuk_Tipi == '2'){
                gidisDonusBiletIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;
            }
            if(yolculuk_Tipi == '1'){
                toplamTutar = indirimliTutar;
            }
            System.out.println("Toplam tutar = " + toplamTutar + " TL");
        }else{
            System.out.println("Hatali Veri girdiniz !");
        }

    }
}
