public class MatrixTranspoze {
    public static void main(String[] args) {
        int k = 0;
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matrisin kendisi : ");
        for(int y = 0; y < array1.length; y++){
            for(int x = 0; x < array1[y].length; x++){
                System.out.print(array1[y][x] + " ");
            }
            System.out.println();
        }
        int[][] array2 = new int[array1[0].length][array1.length];
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                array2[j][i] = array1[i][j];
            }
        }
        System.out.println("Matrisin Transpozu : ");
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
