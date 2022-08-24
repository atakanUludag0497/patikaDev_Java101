import java.util.Scanner;
public class Sinif_Gecme_Durumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            System.out.println("0 ile 100 arasinda bir deger girmediginiz icin mat ortalamaya katilmiyor !");
            mat = 0;
        }
        System.out.println("Turkce notunuz : ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            System.out.println("0 ile 100 arasinda bir deger girmediginiz turkce icin ortalamaya katilmiyor !");
            turkce = 0;
        }
        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            System.out.println("0 ile 100 arasinda bir deger girmediginiz fizik icin ortalamaya katilmiyor !");
            fizik = 0;
        }
        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            System.out.println("0 ile 100 arasinda bir deger girmediginiz kimya icin ortalamaya katilmiyor !");
            kimya = 0;
        }
        System.out.println("Muzik notunuz : ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            System.out.println("0 ile 100 arasinda bir deger girmediginiz muzik icin ortalamaya katilmiyor !");
            muzik = 0;
        }
        double average = (mat+fizik+turkce+kimya+muzik) / 5;


        if(average <= 55){
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere !");
        }else{
            System.out.println("Tebrikler !, sinifi gectiniz.");
        }
        System.out.println("Ortalamaniz : " + average);
    }
}
