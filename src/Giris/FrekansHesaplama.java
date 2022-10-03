import java.sql.Array;
import java.util.Arrays;

public class FrekansHesaplama {
    public static void main(String[] args) {
        int[] array1 = {10, 10, 20, 20, 10, 10, 20, 5, 20, 20};
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println(Arrays.toString(array1));
        System.out.println("* * * * Dizide Tekrar eden sayilar * * * *");
        Arrays.sort(array1);
        calculateFrequency(array1);
    }
    public static void calculateFrequency(int[] arr){
        int counter = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != temp){
                for(int k = 0; k < arr.length; k++){
                    if(arr[k] == arr[i]){
                        counter++;
                    }
                }
                temp = arr[i];
                System.out.println("Dizide " + arr[i] + " sayisi " + counter + " kere tekrar edildi");
                counter = 0;
            }
        }
    }
}
