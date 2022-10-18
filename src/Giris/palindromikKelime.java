public class palindromikKelime {
    //First Solution
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //Second way
    public static boolean isPalindrome_2(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        //First Way
        System.out.println(isPalindrome("kayak"));
        //Second Way
        System.out.println(isPalindrome_2("tenet"));
    }
}