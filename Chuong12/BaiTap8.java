/**
 * BaiTap8
 */
public class BaiTap8 {
    // Tạo giá trị cho mảng từ 1 đến n
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    // x2 giá trị của phần tử trong mảng
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    // Tính tổng phần tử trong mảng
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus = fus + zoo[i];
        }
        return fus;
    }

    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
        // Kết quả là 30
    }
}