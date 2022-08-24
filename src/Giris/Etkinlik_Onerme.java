import java.util.Scanner;
public class Etkinlik_Onerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik giriniz : ");
        heat = input.nextInt();
        if(heat>5 && heat<15)
            System.out.println("Sinemaya gidebilirsin.");
        if(heat>10 && heat<25)
            System.out.println("Piknige gidebilirsin.");
        if(heat>25)
            System.out.println("Hava cok sicak yuzmeye git.");
        if(heat<5)
            System.out.println("Kayak yapabilirsin.");
    }
}
