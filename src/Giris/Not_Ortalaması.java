package Giris;

import java.util.Scanner;
public class Not_Ortalaması {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int math,physics,chemistry,turkish,history,music;
        // Scanner sınıfını tanımladık
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan değerleri al
        System.out.println("Math grade : ");
        math = scan.nextInt();
        System.out.println("Physics grade : ");
        physics = scan.nextInt();
        System.out.println("Chemistry grade : ");
        chemistry = scan.nextInt();
        System.out.println("Turkish grade : ");
        turkish = scan.nextInt();
        System.out.println("History grade : ");
        history = scan.nextInt();
        System.out.println("Music grade : ");
        music = scan.nextInt();
        int sum = math + physics + chemistry + turkish + history + music;
        double average = sum / 6;
        System.out.println("Your average grade is : " + average);
        String passNote = (average >= 60)? "You passed !" : "Failed !";
        System.out.println(passNote);
    }
}
/**
 * Not Ortalaması Hesaplayan Program
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 *
 * Ödev
 * Aynı program içerisinde koşullu ifadeler kullanılarak,
 * eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 * Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.
 *
 * a = 5 ;
 * b = (a == 1) ? 1 : 0
 * Çıktısı : 0
 *
 * Not : If ve Else kullanılmayacak...
 */