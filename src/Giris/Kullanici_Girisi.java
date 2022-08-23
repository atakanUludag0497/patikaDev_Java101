/*Ödev
      Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
      eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
      unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
      şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
      sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {
        String userName,password,newPassword;
        String sifreSifirlama_Q;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adini giriniz : ");
        userName = input.nextLine();
        System.out.println("Sifrenizi giriniz :");
        password = input.nextLine();
        if(userName.equals("patikaDev") && password.equals("java101")){
            System.out.println("Giris yaptiniz ! :)");
        }else{
            System.out.println("Hatali Giris !");
            System.out.println("Sifrenizi mi Unuttunuz ? (y/n)");
            sifreSifirlama_Q = input.nextLine();
            if(sifreSifirlama_Q.toLowerCase().equals("y")){
                System.out.print("Yeni sifreniz : ");
                newPassword = input.nextLine();
                if(password.equals(newPassword)){
                    System.out.println("yeni sifreniz eski sifreniz ile ayni olamaz ! ");
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                }else{
                    password = newPassword;
                    System.out.println("Sifreniz basari ile degistirildi !");
                }
            }
        }
    }
}