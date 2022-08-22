import java.util.Scanner;
public class UcgeninAlaniAndCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r; // yarıçap
        double pi = 3.14;
        System.out.println("Dairenin yaricapini giriniz : ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin alani : " + alan);
        System.out.println("Dairenin cevresi : " +cevre);
        /*
        * Ödev
            Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
            𝜋 sayısını = 3.14 alınız.
            Formül : (𝜋 * (r*r) * 𝛼) / 360
        * */
        System.out.println("* * * * Daire diliminin alanini Bulma * * * *");
        System.out.println("Merkez acisinin olcusunu giriniz : ");
        int merkezAci = input.nextInt();
        double daireDilimi = (pi * (r*r) * merkezAci) / 360;
        System.out.println("Daire dilimi alani : " + daireDilimi);
    }
}
