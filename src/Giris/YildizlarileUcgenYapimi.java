import java.util.Scanner;

public class YildizlarileUcgenYapimi {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Bi sayi gir / Enter a number :");
        num = input.nextInt();
        for(int i = 1; i <= num; i++){
            for(int k = 1; k <= num-i; k++){
                System.out.print(" ");
            }
            //System.out.println("*");
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
        System.out.println(" ");
        System.out.println("< < < < KONSOLDA ELMAS YAPIMI > > > >");
        System.out.println("Girilen sayi = " + num);
        for(int i = 1; i <= num; i++){
            for(int k = 1; k <= num-i; k++){
                System.out.print(" ");
            }
            //System.out.println("*");
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int o = 1; o <= num; o++){
            for(int u = num; u > num-o; u--){
                System.out.print(" ");
            }
            for(int p = 1; p <= 2*(num-o)-1; p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
