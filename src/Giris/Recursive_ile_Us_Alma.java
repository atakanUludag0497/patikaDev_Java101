import java.util.Scanner;

public class Recursive_ile_Us_Alma {
    static int power(int base,int exp){
        if(exp == 0)
            return 1;
        return power(base,exp-1)*base;
    }
    public static void main(String[] args) {
        //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
        int taban,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayisini giriniz : ");
        taban = input.nextInt();
        System.out.println("Us sayisini giriniz : ");
        us = input.nextInt();
        if(us == 0){
            System.out.println("Sonuc : " + 1);
        }else{
            System.out.println("Sonuc : " + power(taban,us));
        }
    }
}
