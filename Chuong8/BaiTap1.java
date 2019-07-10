/**
 * BaiTap1
 */
public class BaiTap1 {
    public static String reverseString(String str) {
        int index = 0;
        String result = "";
        while(index < str.length()){
            result =  str.charAt(index) + result;
            index++;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(reverseString("Nghia"));
    }
}