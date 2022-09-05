import java.util.Scanner;
/*Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
Örneğin 407 sayısını ele alalım.
(4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
1342 sayısına da bakalım.
(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
*/
public class ArmstrongSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNum;
        System.out.print("Bir sayi giriniz : ");
        inputNum = input.nextInt();
        System.out.println(" ");
        System.out.println("Bu sayinin bir Armstrong sayisi olup olmadigi kontrol ediliyor...");
        // önce basamak sayısını bulalım
        int numberOfDigits = 0,tempNum = inputNum;
        while(tempNum != 0){
            tempNum = tempNum / 10;
            numberOfDigits++;
        }
        //System.out.println("Basamak sayisi = " + numberOfDigits);
        tempNum = inputNum;
        int digit,armStrong = 0;
        int numberOfDigitPow = 1;
        // Simdi basamak sayılarını tek tek alalım
        while(tempNum != 0){
            digit = tempNum % 10;
            //System.out.println("Digit = " + digit);
            for(int k = 1; k <= numberOfDigits; k++){
                numberOfDigitPow = digit * numberOfDigitPow;
            }
            //System.out.println("Son digitin kuvveti = " + numberOfDigitPow);
            tempNum = tempNum / 10;
            armStrong = armStrong + numberOfDigitPow;
            numberOfDigitPow = 1;
        }
        System.out.println("Girilen Sayi = " + inputNum);
        System.out.println("Armstrong hesabi = " + armStrong);
        if(inputNum == armStrong){
            System.out.println(armStrong + " bir Armstrong sayisidir !");
        }else{
            System.out.println(armStrong + " bir Armstrong sayisi degildir !");
        }
        // 3 basamakli Armstrong sayilarini bulup ekrana yazan program
        System.out.println("* * * * 3 BASAMAKLI ARMSTRONG SAYILARININ LISTESI * * * *");
        int tempNumForI;
        int numberOfDigitForI = 3;
        int digitForI;
        int armStrongForI = 0;
        int digitPowForI = 1;
        for(int i = 100; i <= 999; i++){
            tempNumForI = i;
            //System.out.println("Number to check whether it is armStrong num or not = " + tempNumForI);
            while(tempNumForI != 0){
                digitForI = tempNumForI % 10;
                //System.out.println("Last digit is = " + digitForI);
                for(int g = 1; g <= numberOfDigitForI; g++){
                    digitPowForI = digitPowForI * digitForI;
                }
                //System.out.println("Power of last digit = " + digitPowForI);
                tempNumForI = tempNumForI / 10;
                armStrongForI = armStrongForI + digitPowForI;
                digitPowForI = 1;
            }
            //System.out.println("Number to check = " + i);
            //System.out.println("Armstrong check = " + armStrongForI);
            if(i == armStrongForI){
                System.out.println("3 basamakli armstrong sayi = " + i);
            }
            armStrongForI = 0;
        }

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        System.out.println(" ");
        System.out.println("* * * * BIR SAYININ BASAMAKLARI TOPLAMI * * * *");
        System.out.print("Bir sayi giriniz = ");
        int sayi = input.nextInt();
        int tempSayi = sayi;
        int digitForsayi;
        int digitSumForsayi = 0;
        while(tempSayi != 0){
            digitForsayi = tempSayi % 10;
            System.out.print(digitForsayi + " + ");
            digitSumForsayi = digitSumForsayi + digitForsayi;
            tempSayi = tempSayi / 10;
            if(tempSayi == 0){
                System.out.print("-->");
            }
        }
        System.out.println(" Sayinin basamaklari Toplami = " + digitSumForsayi);
    }
}
