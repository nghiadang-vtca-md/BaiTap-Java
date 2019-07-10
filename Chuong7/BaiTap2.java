/**
 * BaiTap2
 */
public class BaiTap2 {
    public static double squareRoot(double a){
        double x = a/2;
        double xNext = (x + a/x)/2;
        //double temp = 0;
        while(Math.abs(xNext - x) >= 0.0000000000000001)
        {
            x = xNext;
            xNext = (x + a/x)/2;
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println(squareRoot(9));
    }
}