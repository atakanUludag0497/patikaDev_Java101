// Ödev - Vücut Kitle İndeksi Hesaplayan Program
/*
*    Vücut Kitle İndeksi Hesaplama
*    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
*    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
*    Formül
*    Kilo (kg) / Boy(m) * Boy(m)
*    Çıktısı
*    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
*    Lütfen kilonuzu giriniz : 105
*    Vücut Kitle İndeksiniz : 35.49215792320173
* */

import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        float inputSize;
        int inputWeight;
        float body_mass_index;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        inputSize = input.nextFloat();
        System.out.println("Lutfen kilonuzu giriniz : ");
        inputWeight = input.nextInt();
        body_mass_index = inputWeight / (inputSize * inputSize);
        System.out.println("Vucut kitle indexiniz : " + body_mass_index);
    }
}
