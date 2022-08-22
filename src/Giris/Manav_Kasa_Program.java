// Manav Kasa Programı
/*
*  Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
*  toplam tutarını ekrana yazdıran programı yazın.
*   Meyveler ve KG Fiyatları
*   Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
    *
    * Örnek çıktı :
    *
    * Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL
* */
import java.util.Scanner;

public class Manav_Kasa_Program {
    public static void main(String[] args) {
        double armutKilo = 2.14, elmaKilo = 3.67, domatesKilo = 1.11, muzKilo = 0.95, patlicanKilo = 5.0;
        int armutinput,elmainput,domatesinput,muzinput,patlicaninput;
        double armutUcret,elmaUcret,domatesUcret,muzUcret,patlicanUcret;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kac kilo ? ");
        armutinput = input.nextInt();
        armutUcret = armutKilo * armutinput;
        System.out.println("Elma Kac Kilo ? ");
        elmainput = input.nextInt();
        elmaUcret = elmaKilo * elmainput;
        System.out.println("Domates kac kilo ? ");
        domatesinput = input.nextInt();
        domatesUcret = domatesKilo * domatesinput;
        System.out.println("Muz kac kilo ? ");
        muzinput = input.nextInt();
        muzUcret = muzKilo * muzinput;
        System.out.println("Patlican kac kilo ? ");
        patlicaninput = input.nextInt();
        patlicanUcret = patlicanKilo * patlicaninput;
        System.out.println("Toplam tutar : " + (armutUcret+elmaUcret+domatesUcret+muzUcret+patlicanUcret));
    }
}
