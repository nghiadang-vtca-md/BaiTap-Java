/**
 * BaiTap4
 */
public class BaiTap4 {
    public static int factorial(int n){
        int result = n;
        while(n>1){
            result*=--n;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}