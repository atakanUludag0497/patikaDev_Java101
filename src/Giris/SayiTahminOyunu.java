import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu{
    public static void main(String[] args) {
        //int number = (int)(Math.random() * 100);
        Random rand =new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrongNums = new int[5];
        int selected;
        System.out.println(number);

        while(right < 5){
            System.out.println("Lutfen bir sayi tahmin ediniz: ");
            selected = input.nextInt();
            if(selected < 0 || selected > 99){
                System.out.println("Lutfen 1 ile 100 arasinda bir sayi giriniz");
                if(!isWrong){
                    isWrong = true;
                    System.out.println("Bir dahaki hatali girisinizde hakkinizdan dusulecektir...!");
                }else{
                    wrongNums[right] = selected;
                    right++;
                    System.out.println("Hatali giris yaptiniz. Kalan Hak: " + (5 - right));
                }
                continue;
            }
            if(selected == number){
                isWin = true;
                System.out.println("Tebrikler, dogru tahmin! Tahmin edilen sayi : " + number);
                break;
            }else{
                wrongNums[right] = selected;
                right++;
                System.out.println("Yanlis sayi! baska bir tahmin yapin.");
                if(selected > number){
                    System.out.println(selected + " sayisi gizli sayidan buyuktur.");
                }else{
                    System.out.println(selected + " sayisi gizli sayidan kucuktur.");
                }
                System.out.println("Kalan hakkiniz : " + (5 - right));
            }
        }
        if(!isWin){
            System.out.println("Game Over ! kaybettiniz...");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrongNums));
        }
    }
}