/**
 * BaiTap10
 */
public class BaiTap10 {
    public static boolean isAbecedarian(String input){
        input = input.toLowerCase();
        int len = input.length();
        int index = 0;
        while(index < len - 1){
            if((int)input.charAt(index) > (int)input.charAt(index+1)){
                return false;
            }
            index++;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAbecedarian("acdtdg"));
        for(int i = 65; i<=140;i++){
            System.out.println(i + " --- " + (char)i);
        }
    }
}
