import java.util.Scanner;

public class Mukemmel_Sayi {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
        //ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        //değilse “mükemmel sayı değildir.” ifadelerini
        //ekrana yazan programı Java dilinde yazınız.
        //Mükemmel Sayı Nedir ?
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        //kendisine eşit olan sayıya mükemmel sayı denir.
        //Örneğin 6 sayısını ele alalım: 1, 2, 3 ve 6 bu sayının bölenleridir ve tüm bu bölenlerin toplamı, yani 1+2+3 = 6
        int inputNum;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        inputNum = input.nextInt();
        for(int i = 1; i < inputNum; i++){
            if(inputNum % i == 0){
                sum = sum + i;
            }
        }
        if(sum == inputNum){
            System.out.println(inputNum + " bir Mukemmel sayidir !");
        }else{
            System.out.println(inputNum + " bir Mukemmel sayi Degildir.");
        }
    }
}
