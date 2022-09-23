import java.util.Arrays;
import java.util.Scanner;

public class MaxMin_in_anArray {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, 33, 15, 12, 788, 1, -1, -778, 2 ,0};
        int min = list[0];
        int max = list[0];
        for(int i : list){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Minimum deger : " + min);
        System.out.println("Maximum deger : " + max);
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        int closeMin = min;
        int closeMax = max;
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen sayi : " + sayi);
        for(int x  : list){
            if(x < sayi && x > closeMin){
                closeMin = x;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + closeMin);
        for(int y : list){
            if(y > sayi && y < closeMax){
                closeMax = y;
            }
        }
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + closeMax);
    }
}
