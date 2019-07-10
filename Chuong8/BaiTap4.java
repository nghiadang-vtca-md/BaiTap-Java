/**
 * BaiTap3
 */
public class BaiTap4 {
    public static int checkMissParenthesis(String str){
        int len = str.length();
        int i = 0;
        int count = 0;
        while(i<len){
            char c = str.charAt(i);
            if(c=='('){
                count = count + 1; 
            }
            else if(c==')'){
                count = count - 1;
            }
            i++;
        }
        return count;     // 0 : đủ __________  > 0 : thiếu dấu ')' __________ < 0 : thiếu dấu ')'
    }
    public static void main(String[] args){
        String test = "(3 + 5) * 2)";
        int check = checkMissParenthesis(test);
        System.out.println(check);
        if(check > 0){
            System.out.println("Thiếu dấu ')'");
        }
        else if(check < 0){
            System.out.println("Thiếu dấu '('");
        }
        else{
            System.out.println("Đúng");
        }
    }
}