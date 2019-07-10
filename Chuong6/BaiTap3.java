/**
 * BaiTap3
 */
public class BaiTap3 {
    public static boolean isTriagle(int c1, int c2, int c3) {
        if(c1 + c2 < c3 || c1 + c3 < c2 || c2 + c3 < c1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isTriagle(3, 4, 5));
        System.out.println(isTriagle(1, 5, 2));
        System.out.println(isTriagle(9, 12, 15));
        System.out.println(isTriagle(12, 50, 200));
        System.out.println(isTriagle(1, 5, 20));
    }
}