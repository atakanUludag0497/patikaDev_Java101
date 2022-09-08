import java.util.Scanner;


public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayisini Giriniz : ");
        int n1 = input.nextInt();
        System.out.println("n2 sayisini Giriniz : ");
        int n2 = input.nextInt();
        int smallNum,bigNum;
        if(n1 <= n2){
            smallNum = n1;
            bigNum = n2;
        }else{
            smallNum = n2;
            bigNum = n1;
        }
        int ebob = 1;
        for(int i = 1; i <= smallNum; i++){
            if(smallNum % i == 0 && bigNum % i == 0){
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("EBOB = " + ebob);
        // daha hızlı yöntem
        System.out.println("Baska bi yontem ile ebob bulma #");
        for(int k = smallNum; k >= 1; k--){
            if(smallNum % k == 0 && bigNum % k == 0){
                ebob = k;
                break;
            }
        }
        System.out.println("Yeni EBOB = " + ebob);
        System.out.println("EKOK bulma - - - - - - - -");
        System.out.println("Girilen sayilarin EKOK degeri : ");
        int ekok = 1;
        for(int j = 1; j <= (smallNum*bigNum); j++){
            if(j % smallNum == 0 && j % bigNum == 0){
                ekok = j;
                break;
            }
        }
        System.out.println("EKOK = " + ekok);
        System.out.print("Check => ");
        System.out.println(smallNum*bigNum / ebob);

        // Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
        System.out.println("Java ile iki sayinin EBOB ve EKOK degerlerini \"While Dongusu\" kullanarak yaziniz.");
        System.out.println("* * * * * * * * * * * *");
        System.out.println("Girilen sayilar = " + smallNum + " , " + bigNum);
        //EBOB
        int myDivisor;
        myDivisor = smallNum;
        while(myDivisor >= 1){
            if(smallNum % myDivisor == 0 && bigNum % myDivisor == 0){
                ebob = myDivisor;
                break;
            }
            myDivisor--;
        }
        System.out.println("While dongusu Ebobu = " + ebob);
        //Ekok
        int worstCaseEkok = smallNum * bigNum;
        int newEkokNum = 1;
        while(worstCaseEkok >= newEkokNum){
            if(newEkokNum % smallNum == 0 && newEkokNum % bigNum == 0){
                ekok = newEkokNum;
                break;
            }
            newEkokNum++;
        }
        System.out.println("While dongusu Ekoku = " + ekok);
    }
}
