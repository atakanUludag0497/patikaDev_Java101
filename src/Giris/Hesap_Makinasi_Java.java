import java.util.Scanner;
public class Hesap_Makinasi_Java {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();
        System.out.println("Toplamak icin : 1\nCikarmak icin : 2\nCarpmak icin : 3\nBolmek icin : 4");
        System.out.print("Seciminiz : ");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("Bir sayi sifira bölünemez !");
                }else{
                    System.out.println("Bolme : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlis bir secim yaptiniz tekrar deneyin !");
                break;
        }
    }
}
