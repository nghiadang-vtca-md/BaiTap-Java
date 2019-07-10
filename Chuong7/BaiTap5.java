/**
 * BaiTap5
 */
public class BaiTap5 {
    public static int factorial(int n){
        int result = n;
        while(n>1){
            result*=--n;
        }
        return result;
    }
    public static double myexp(double x) {
        int n = 10;
        double sum = 1;
        int i = 1;
        while(i<=n){
            sum+= Math.pow(x, i)/factorial(i);
            i++;
        }
        return sum;
    }

    public static double myexp2(double x){
        int n = 10; // mặc định vô hạn là 10
        double sum =1;
        double pre = 1;
        int i = 1;
        while(i<=n){
            pre = (pre*x)/i;
            sum += pre;
            i++;
        }
        return sum;
    }

    public static void check(double x)
    {
        System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x));
    }
    public static void main(String[] args) {
        //System.out.println(myexp(1));
        //System.out.println(myexp2(1));
        check(0.1);
        check(1);
        check(10);
        check(100);

        System.out.println(myexp(-0.1));
        System.out.println(myexp(-1));
        System.out.println(myexp(-10));
        System.out.println(myexp(-100));


    }
}