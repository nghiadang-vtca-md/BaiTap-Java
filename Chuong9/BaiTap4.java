/**
 * BaiTap4
 */
import java.math.BigInteger;
public class BaiTap4 {

    public static void printFactorial(int n) {
        int index = 1;
        int s = 1;

        BigInteger big_s = BigInteger.valueOf(s);
        BigInteger big_index = BigInteger.valueOf(index);
        BigInteger big_n = BigInteger.valueOf(n+1);

        int addOne = 1;
        BigInteger big_addOne = BigInteger.valueOf(addOne);

        while(big_index.compareTo(big_n) == -1){
            System.out.print(big_index + "\t");

            big_s = big_s.multiply(big_index);
            System.out.println(big_s);

            big_index = big_index.add(big_addOne);
        }    
    }
    public static void main(String[] args) {
        printFactorial(30);
    }
}