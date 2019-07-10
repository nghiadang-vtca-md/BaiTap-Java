/**
 * BaiTap5
 */
public class BaiTap5 {
    public static boolean areFactor(int n, int[] arr){
        int length = arr.length;
        for(int i =0;i<length;i++){
            if(n % arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] testArr = {2,4,3,12,13};
        boolean result = areFactor(12, testArr);
        System.out.println(result);
    }
}