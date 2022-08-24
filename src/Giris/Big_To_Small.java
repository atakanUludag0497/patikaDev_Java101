import java.util.Scanner;

public class Big_To_Small {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayi : ");
        a = input.nextInt();
        System.out.println("2. sayi :");
        b = input.nextInt();
        System.out.println("3. sayi : ");
        c = input.nextInt();
        if((a > b) && (a > c)){
            if(b > c){
                System.out.println("a > b > c");
            }else{
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if(a > c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        }else {
            if(b > a){
                System.out.println("c > b > a");
            }else{
                System.out.println("c > a > b");
            }
        }
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        System.out.println("* * * * Kucukten buyuge * * * *");
        if((a > b) && (a > c)){
            if(b > c){
                System.out.println("c < b < a");
            }else{
                System.out.println("b < c < a");
            }
        } else if ((b > a) && (b > c)) {
            if(a > c){
                System.out.println("c < a < b");
            }else{
                System.out.println("a < c < b");
            }
        }else {
            if(b > a){
                System.out.println("a < b < c");
            }else{
                System.out.println("b < a < c");
            }
        }
    }
}
