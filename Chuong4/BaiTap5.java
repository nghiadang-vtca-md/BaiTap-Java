/**
 * BaiTap5
 */
public class BaiTap5 {
    public static void check_fermat(int a, int b, int c, int n) {
        int a_n = raiseToPow(a,n);
        int b_n = raiseToPow(b, n);
        int c_n = raiseToPow(c, n);
        if((a_n + b_n) == c_n){
            if(n==2){
                System.out.println("Trường hợp đặc biệt nè !!!!");
            }
            else{
                System.out.println("Trời, Fermat đã lầm");
            }
        }
        else{
            
            System.out.println("Không, vẫn không đúng");
        }
    }
    public static int raiseToPow(int x, int y) {
        return (int)Math.pow(x,y);
    }
    public static void main(String[] args) {
        check_fermat(0,2,2,2);
        check_fermat(1,1,1,2);
        check_fermat(2,2,2,2);
        check_fermat(3,3,3,2);
    }
}