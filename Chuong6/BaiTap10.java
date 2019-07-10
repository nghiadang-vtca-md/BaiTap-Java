/**
 * BaiTap10
 */
public class BaiTap10 {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0)
            return a+b;
        if(a>b)
            return gcd(b,a-b);
        if(b>a)
            return gcd(a,b-a);
        return 0;
    }
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd(a, b));
    }
}