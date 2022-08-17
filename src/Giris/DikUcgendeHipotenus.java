import java.util.Scanner;

public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        // Değişkenleri oluşturalım
        int a,b;
        double c;
        // Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenari Giriniz : ");
        a = girdi.nextInt();
        System.out.println("2. Kenari Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus : " + c);

        // Ödev
        /*
        * Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
            Formül
            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
            𝑢 = (a+b+c) / 2
            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        * */
        System.out.println("* * * * * Ucgen Alani hesaplama * * * * *");
        // Değişkenlerimizi oluşturalım
        int k_1,k_2,k_3;
        double area_of_triangle;
        double perimeter_of_triangle,u;
        System.out.println("1. Kenari Giriniz : ");
        k_1 = girdi.nextInt();
        System.out.println("2. Kenari Giriniz :");
        k_2 = girdi.nextInt();
        System.out.println("3. Kenari Giriniz :");
        k_3 = girdi.nextInt();

        u = (k_1 + k_2 + k_3) / 2;
        perimeter_of_triangle = 2 * u;
        area_of_triangle = Math.sqrt(u * (u - k_1) * (u - k_2) * (u - k_3));
        System.out.println("Ucgenin Alani --> " + area_of_triangle);
    }
}
