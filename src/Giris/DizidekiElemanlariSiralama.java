import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        System.out.println("* * * * Dizideki elemanlari siralama * * * *");
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        int arrSize = input.nextInt();
        int[] arr1 = new int[arrSize];
        for(int i = 0; i < arrSize; i++){
            System.out.print(i+1 + ". Elemani : ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Siralama : ");
        System.out.println(Arrays.toString(arraySort(arr1)));
    }
    public static int[] arraySort(int[] arr){
        int temporaryNum;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                temporaryNum = 0;
                if(arr[i] > arr[j]){
                    temporaryNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporaryNum;
                }
            }
        }
        return arr;
    }
}
