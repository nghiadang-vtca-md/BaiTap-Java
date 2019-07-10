/**
 * BaiTap7
 */
public class BaiTap7 {

    // Tình tổng phần tử trong màng
    public static int banana(int[] a) {
        int grape = 0;
        int i = 0;
        while (i < a.length) {
            grape = grape + a[i];
            i++;
        }
        return grape;
    }

    // Đếm số lượng của phần tử p trong mảng
    public static int apple(int[] a, int p) {
        int i = 0;
        int pear = 0;
        while (i < a.length) {
            if (a[i] == p)
                pear++;
            i++;
        }
        return pear;
    }

    // Tìm vị trí đầu tiên của phần tử p trong mảng a
    public static int grapefruit(int[] a, int p) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == p)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}