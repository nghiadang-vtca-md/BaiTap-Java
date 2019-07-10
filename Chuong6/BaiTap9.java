/**
 * BaiTap9
 */
public class BaiTap9 {

    public static double power(double x,int n) {
        if(n==1){
            return x;
        }
        else{
            return x*power(x, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 8));
        char x = 'ễ';
        int a = 217;
        System.out.println((int)x);
        System.out.println((char)a);

    }
}