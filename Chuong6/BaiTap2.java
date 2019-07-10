/**
 * BaiTap2
 */
public class BaiTap2 {

    public static double multadd(double d1, double d2, double d3) {
        double result = d1*d2 + d3;
        return result;
    }
    public static void main(String[] args) {
        
        double test1 = multadd(1.0, 2.0, 3.0);
        System.out.println(test1);
        double result_Cau4_1 = multadd(Math.sin(Math.PI/4), 2, Math.cos(Math.cos(Math.PI/4))) / 2;
        System.out.println("Kết quả câu 4.1: " + result_Cau4_1);
        double result_Cau4_2 = Math.log(multadd(10, 20, 0));
        System.out.println("Kết quả câu 4.2: " + result_Cau4_2);
    }
}