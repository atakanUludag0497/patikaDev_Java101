
public class Asal_Sayilar {
    public static void main(String[] args) {
        int border = 100;
        boolean isPrime = true;
        System.out.println("* * * * -1 ile 100 - arasindaki asal sayilari bulan program * * * *");
        for(int i = 2; i <= border; i++){
            for(int k = 2; k < i; k++){
                if(i % k == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                if(i == 97){
                    System.out.print(i);
                }else{
                    System.out.print(i + " - ");
                }
            }
            isPrime = true;
        }
    }
}
