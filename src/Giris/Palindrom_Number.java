import java.util.Scanner;

public class Palindrom_Number {
    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;
        while(temp != 0){
            System.out.println("=========================");
            System.out.println("Sayi => " + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak => " + lastNumber);
            reverseNumber = (reverseNumber*10) + lastNumber;
            System.out.println("Yeni Sayi => " + reverseNumber);
            temp = temp / 10;
        }
        if(reverseNumber == number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();
        if(isPalindrom(sayi)){
            System.out.println(sayi + " bir palindrome sayidir.");
        }else{
            System.out.println(sayi + " palindrome bir sayi degildir !");
        }
    }
}
