/**
 * BaiTap11
 */
public class BaiTap11 {
    public static boolean isDupledrome(String input){
        int len = input.length();
        int index = 0;
        while(index < len - 1){
            char char1 = input.charAt(index);
            char char2 = input.charAt(index + 1);
            if( char1 != char2 ){
                return false;
            }
            index = index + 2;
        }
        return true;
    }
    public static void main(String[] args){
        String test1 = "ssaabb";
        String test2 = "llaammaa";
        String test3 = "aabbcdee";
        System.out.println(isDupledrome(test1));
        System.out.println(isDupledrome(test2));
        System.out.println(isDupledrome(test3));
    }
}