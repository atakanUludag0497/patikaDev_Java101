import java.util.Scanner;


public class Min_Max_Degeri {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        // ve bu sayıları ekrana yazan programı yazın.
        int amountOfNum;
        int num;
        int smallNum = 2147483646;
        int bigNum = -2147483647;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac Tane Sayi Gireceksiniz ? :");
        amountOfNum = input.nextInt();
        for(int i = 1; i <= amountOfNum; i++){
            System.out.print(i + ". Sayiyi giriniz : ");
            num = input.nextInt();
            if(num < smallNum){
                smallNum = num;
            }
            if(num > bigNum && num >= smallNum){
                bigNum = num;
            }
        }
        System.out.println("En buyuk Sayi = " + bigNum);
        System.out.println("En kucuk Sayi = " + smallNum);
    }
}
