import java.util.Scanner;

public class ATM_projesi {
    public static void main(String[] args) {
        // ATM projesi switch case ile
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int deposit;
        int withdraw;
        boolean entryAccepted = false;
        while(right > 0){
            System.out.print("Kullanici Adiniz : ");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("Dev123")){
                do{
                    System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz !");
                    System.out.println("1-Para Yatirma.\n"
                            +"2-Para Cekme.\n"
                            +"3-Bakiye sorgulama.\n"
                            +"4-Cikis Yap.");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Lutfen yatirmak istediginiz miktari giriniz : ");
                            deposit = input.nextInt();
                            balance = balance + deposit;
                            System.out.println("Bakiye = " + balance);
                            break;
                        case 2:
                            System.out.println("Lutfen para cekmek istediginiz miktari giriniz : ");
                            withdraw = input.nextInt();
                            if(withdraw > balance){
                                System.out.println("Bakiye yetersiz !");
                                System.out.println("Cikis yapiliyor...");
                                break;
                            }else{
                                balance = balance - withdraw;
                                System.out.println("Kalan bakiye = " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Guncel bakiyeniz = " +balance);
                            break;
                        default:
                            System.out.println("Cikis yapiliyor Tekrar gorusmek uzere...");
                            break;
                    }
                }while(select != 4);
                break;
            }else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                }else{
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
    }
}




/*

        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int deposit;
        int withdraw;
        while(right > 0){
            System.out.print("Kullanici Adiniz : ");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("Dev123")){
                do{
                    System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz !");
                    System.out.println("1-Para Yatirma.\n"
                            +"2-Para Cekme.\n"
                            +"3-Bakiye sorgulama.\n"
                            +"4-Cikis Yap.");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.print("Lutfen yatirmak istediginiz miktari giriniz : ");
                        deposit = input.nextInt();
                        balance = balance + deposit;
                        System.out.println("Bakiye = " + balance);
                    }else if(select == 2){
                        System.out.println("Lutfen para cekmek istediginiz miktari giriniz : ");
                        withdraw = input.nextInt();
                        if(withdraw > balance){
                            System.out.println("Bakiye yetersiz !");
                            System.out.println("Cikis yapiliyor...");
                            break;
                        }else{
                            balance = balance - withdraw;
                            System.out.println("Kalan bakiye = " + balance);
                        }
                    }else if(select == 3){
                        System.out.println("Guncel bakiyeniz = " +balance);
                    }else{
                        System.out.println("Cikis yapiliyor Tekrar gorusmek uzere...");
                    }
                }while(select != 4);
                break;
            }else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                }else{
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
         */