/**
 * BaiTap3
 */
public class BaiTap3 {
    public static double power(double x, int n){
        double result = 1;
        while(n>0){
            result*= x;
            n--;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(power(3,0));
    }
}