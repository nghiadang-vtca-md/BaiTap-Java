/**
 * BaiTap8
 */
public class BaiTap8 {
    public static char first(String s) {
        return s.charAt(0);
    }
    public static String rest(String s) {
        return s.substring(1,s.length());
    }
    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        if(s.length() == 0)
            return;
        else{
            System.out.println(first(s));
            printString(rest(s));
        }

    }

    public static void printBackward(String s) {
        if(length(s) == 0)
        {
            return;
        }
        else{
            System.out.println(s.charAt(s.length()-1));
            printBackward(s.substring(0, s.length()-1));
        }
    }

    public static String reverseString(String s) {
        if(length(s)==1){
            return s.charAt(0) + "";
        }
        else{
            return reverseString(rest(s)) + s.charAt(0);
        }
    }
    public static void main(String[] args) {
        System.out.println(first("Dang"));
        System.out.println(rest("Nghia"));
        System.out.println(length("Duc"));

        //
        printString("Dang Duc Nghia");
        printBackward("Nghia");

        //System.out.println(reverseString("Nghia"));


    }
}