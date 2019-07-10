/**
 * BaiTap2
 */
public class BaiTap2 {
    public static double randomDouble(double low, double high){
        double result = Math.random();
        result = low*(1-result) + high*result;
        return result;
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            double x = randomDouble(6, 7);
            System.out.println(x);
        }
    }
}