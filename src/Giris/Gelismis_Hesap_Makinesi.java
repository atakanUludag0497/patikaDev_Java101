import java.util.Scanner;

public class Gelismis_Hesap_Makinesi {
    static void sum(int num1,int num2){
        int result = num1 + num2;
        System.out.println("Toplam : " + result);
    }
    static void minus(int num1,int num2){
        int result = num1 - num2;
        System.out.println("Cikarma : " + result);
    }
    static void times(int num1,int num2){
        int result = num1 * num2;
        System.out.println("Carpma : " + result);
    }
    static void divided(int num1,int num2){
        if(num2 == 0){
            System.out.println("Sayi sifira bolunemez !");
        }else{
            double result = num1 / num2;
            System.out.println("Bolme : " + result);
        }
    }
    static void power(int num1,int num2){
        if(num2 == 0){
            System.out.println("Ussu : " + 1);
        }else{
            int result = (int)Math.pow(num1,num2);
            System.out.println("Ussu : " + result);
        }
    }
    static void Mod(int num1,int num2){
        if(num2 == 0){
            System.out.println("Sifir ile mod alinamaz !");
        }else{
            int result = num1 % num2;
            System.out.println("Mod : " + result);
        }
    }
    static void areaAndperimeterOfrectangle(int num1,int num2){
        int perimeter = 2 * (num1 + num2);
        int area = num1 * num2;
        System.out.println("Perimeter of Rectangle = " + perimeter);
        System.out.println("Area of Rectangle = " + area);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama islemi\n"
                + "2-Cikarma islemi\n"
                + "3-Carpma islemi\n"
                + "4-Bolme islemi\n"
                + "5-Uslu sayi Hesaplama\n"
                + "6-Mod Alma\n"
                + "7-Dikdortgen Alan ve Cevre Hesabi\n"
                + "0-Cikis Yap.";
        System.out.println("- - - - - - - - - - - - - -");
        System.out.println(menu);
        System.out.println("- - - - - - - - - - - - - -");
        while(true){
            System.out.print("Bir islem seciniz : ");
            select = input.nextInt();
            if(select == 0){
                System.out.println("Programdan cikis yapiliyor...");
                break;
            }
            System.out.println("Birinci sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.println("Ikinci sayiyi giriniz : ");
            int b = input.nextInt();
            switch(select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    Mod(a,b);
                    break;
                case 7:
                    areaAndperimeterOfrectangle(a,b);
                    break;
                default:
                    System.out.println("Yanlis bir giris yaptiniz !");
                    break;
            }
        }
    }
}