import java.util.Scanner;

public class KDV_Tutarı_Hesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret tutarini Giriniz : ");
        tutar = input.nextDouble();
        if(tutar > 0 && tutar < 1000){
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Orani : " + kdvOran);
            System.out.println("KDV Tutari : " + kdvTutar);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }
        if(tutar > 1000){
            kdvOran = 0.8;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Orani : " + kdvOran);
            System.out.println("KDV Tutari : " + kdvTutar);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }

    }
}
