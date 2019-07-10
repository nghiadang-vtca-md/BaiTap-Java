/**
 * BaiTap1
 */
public class BaiTap1 {

    public static boolean isDivisible(int n, int m) {
        if(n%m == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isDivisible(6, 2));
        System.out.println(isDivisible(6, 4));
    }
}