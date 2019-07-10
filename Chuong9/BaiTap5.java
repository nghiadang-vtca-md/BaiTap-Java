/**
 * BaiTap5
 */
public class BaiTap5 {
    public static int pow(int x, int n) {
        if (n == 0) return 1;
        // tính x mũ n/2 bằng cách đệ quy
        int t = pow(x, n/2);
        // nếu n chẵn, kết quả là t bình phương
        // nếu n lẻ, kết quả là t bình phương nhân với x
        if (n%2 == 0) {
        return t*t;
        } else {
        return t*t*x;
        }
        }
    public static void main(String[] args) {
        System.out.println(pow(10,10));
    }
}