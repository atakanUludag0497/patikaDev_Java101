/*Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart*/

// Aynı örneği switch-case kullanmadan yapınız.
import java.util.Scanner;

public class Horoscpe_Find {
    public static void main(String[] args) {
        int month,day;
        String burc = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdugunuz Ay : ");
        month = input.nextInt();
        System.out.println("Dogdugunuz Gun : ");
        day = input.nextInt();
        switch (month){
            case 1:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        //System.out.println("Oglak burcu");
                        burc = "Oglak";
                    }else {
                        //System.out.println("Kova burcu");
                        burc = "Kova";
                    }
                }else {
                    //System.out.println("Gecersiz bir gun girdiniz !");
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 28){
                    if(day < 20){
                        burc = "Kova";
                    }else {
                        burc = "Balik";
                    }
                }else {
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day <= 31){
                    if(day < 21){
                        burc = "balik";
                    }else {
                        burc = "Koc";
                    }
                }else{
                    isError = true;
                }
                break;
            case 4:
                if(day >=1 && day <= 30){
                    if(day < 21){
                        burc = "Koc";
                    }else{
                        burc = "Boga";
                    }
                }else{
                    isError = true;
                }
                break;
            case 5:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        burc = "Boga";
                    }else{
                        burc = "ikizler";
                    }
                }else {
                    isError = true;
                }
                break;
            case 6:
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        burc = "ikizler";
                    }else {
                        burc = "Yengec";
                    }
                }else{
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        burc = "Yengec";
                    }else{
                        burc = "Aslan";
                    }
                }else {
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        burc = "Aslam";
                    }else{
                        burc = "Basak";
                    }
                }else{
                    isError = true;
                }
                break;
            case 9:
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        burc = "Basak";
                    }else {
                        burc = "Terazi";
                    }
                }else{
                    isError = true;
                }
                break;
            case 10:
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        burc = "Terazi";
                    }else{
                        burc = "Akrep";
                    }
                }else{
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        burc = "Akrep";
                    }else{
                        burc = "Yay";
                    }
                }else{
                    isError = true;
                }
                break;
            case 12:
                if(day >= 1 && day <= 31){
                    if(day > 21){
                        burc = "Oglak";
                    }else {
                        burc = "Yay";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                System.out.println("Hatali bir ay girdiniz !");
        }
        if(isError){
            System.out.println("Gecersiz bir gun girdiniz !");
        }
        System.out.println("Burcunuz --> " + burc);
    }
}
