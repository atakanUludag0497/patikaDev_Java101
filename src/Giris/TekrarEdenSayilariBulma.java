public class TekrarEdenSayilariBulma {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int k = 0; k < list.length; k++){
                if(k != i && list[k] == list[i]){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Dizide tekrar eden sayilar : ");
        System.out.print("[ ");
        for(int value : duplicate){
            if(value != 0){
                System.out.print(value + ", ");
            }
        }
        System.out.println("]");
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Dizinin icindeki tekrar eden cift sayilar : ");
        int[] list2 = {17, 18, 20, 18, 3, 19, 42, 42, 111, 111, 8, 9, 2, 9, 2, 2, 6, 6, 71, 34, 34, 16, 16, 75, 75};
        int[] duplicateEvenNums = new int[list.length];
        int startIndexII = 0;
        for(int i = 0; i < list2.length; i++){
            for(int k = 0; k < list2.length; k++){
                if(k != i && list2[k] == list2[i] && list2[k] % 2 == 0){
                    if(!isFind(duplicateEvenNums,list2[i])){
                        duplicateEvenNums[startIndexII++] = list2[i];
                    }
                    break;
                }
            }
        }
        System.out.print("[ ");
        for(int value : duplicateEvenNums){
            if(value != 0){
                System.out.print(value + ", ");
            }
        }
        System.out.println("]");
    }
}