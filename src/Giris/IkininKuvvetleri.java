import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        System.out.println("100 icinde 2'nin kuvvetleri :");
        for(int i = 1; i <= 100; i=i*2){
            System.out.print(i + " - ");
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Sinir sayisini giriniz :");
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int sayi = input.nextInt();
        System.out.println("4'un kuvvetleri - - -");
        for(int k = 1; k <= sayi; k=k*4){
            System.out.print(k + " - ");
        }
        System.out.println();
        System.out.println("5'in kuvvetleri - - -");
        for(int j = 1; j <= sayi; j=j*5){
            System.out.print(j + "- ");
        }
    }
}
