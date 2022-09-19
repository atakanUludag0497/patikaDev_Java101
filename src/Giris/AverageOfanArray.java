package Dizideki_Elemanlarin_Ortalamasi;

public class AverageOfanArray {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double sum = 0;
        for(int i = 0; i < list.length; i++){
            sum = sum + list[i];
        }
        double average = sum / list.length;
        System.out.println("Arithmetic average of the list is : " + average);

        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        double harmonicSum = 0;
        for(int i = 0; i < list.length; i++){
            harmonicSum = harmonicSum + (1.0 / list[i]); // 1/1 + 1/2 + 1/3 + 1/4 + 1/5
        }
        System.out.println("Harmonic average of the list is : " + harmonicSum);
    }
}
