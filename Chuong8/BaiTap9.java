/**
 * BaiTap9 : Palindrome
 */ 
public class BaiTap9 {
    public static char first(String str){
        return str.charAt(0);
    }
    public static char last(String str) {
        return str.charAt(str.length()-1);
    }
    public static String middle(String str) {
        int len = str.length();
        if(len==0 || len == 1 || len ==2){
            return "";
        }
        return str = str.substring(1,str.length()-1);
    }
    public static boolean isPalindrome(String input){
        String str = input;
        if(first(str) == last(str))
        {
            String middle = middle(str);
            if(middle!=""){
                return isPalindrome(middle);
            }
            else
            {
                if(middle.length()==2){
                    return isPalindrome(middle);
                }
                if(middle.length()==1 || middle.length()==0){
                    return true;
                }
                return false;
            } 
        }
        else
        {
            return false;
        }
    }
    public static boolean isPalindrome2(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
           if (s.charAt(i) != s.charAt(n - i - 1)) {
               return false;
           }
        }
        return true;
    }

    public static boolean isPalindrome3(String s){
        String sReverse = "";
        int index = s.length() - 1;
        while(index >= 0){
            sReverse += s.charAt(index);
            index--;
        }
        System.out.println(sReverse);
        if(s.equals(sReverse)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("aaa"));
        System.out.println(isPalindrome2("aaba"));
        System.out.println(isPalindrome3("nggn"));
    }
}