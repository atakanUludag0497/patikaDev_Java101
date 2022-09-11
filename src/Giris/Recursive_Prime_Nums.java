import java.util.Scanner;

public class Recursive_Prime_Nums {
    static boolean isPrime(int num,int divisor){
        if(num < 2){
            return false;
        }
        if(divisor == 1){
            return true;
        }
        if(num % divisor == 0){
            return false;
        }
        return isPrime(num,divisor-1);
    }
    public static void main(String[] args) {
        //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
        int num;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : " );
        num = input.nextInt();
        isPrime = isPrime(num,num/2);
        if(isPrime){
            System.out.println(num + " bir asal sayidir.");
        }else{
            System.out.println(num + " asal bir sayi degildir !");
        }
        System.out.println("* * * Girilen sayiya kadar olan asal sayilar * * *");
        for(int i = 1; i <= num; i++){
            isPrime = isPrime(i,i/2);
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}
