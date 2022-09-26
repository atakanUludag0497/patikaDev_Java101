public class CokBoyutluDiziHarfOlusturma {
    public static void main(String[] args) {
        System.out.println("= = = = = = = = = = A = = = = = = = = = =");
        String[][] letter = new String[6][4];
        for(int i = 0; i < letter.length; i++){
            for(int j = 0; j < letter[i].length; j++){
                if(i == 0 || i == 2){
                    letter[i][j] = " * ";
                }else if(j == 0 || j == 3){
                    letter[i][j] = " * ";
                }else{
                    letter[i][j] = "   ";
                }
            }
        }
        for(String[] row : letter){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        //Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
        String[][] letterB = new String[7][4];
        System.out.println("= = = = = = = = = = B = = = = = = = = = =");
        for(int i = 0; i < letterB.length; i++){
            for(int j = 0; j < letterB[i].length; j++){
                if(i == 0 || i == 6 || i == 3){
                    letterB[i][j] = " * ";
                }else if(j == 0 || j == 3){
                    letterB[i][j] = " * ";
                }else{
                    letterB[i][j] = "   ";
                }
            }
        }
        for(String[] row : letterB){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
