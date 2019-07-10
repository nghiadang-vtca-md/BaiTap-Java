/**
 * BaiTap6
 */
public class BaiTap6 {
    public static int indexOfTarget(int[] arr, int target){
        int length = arr.length;
        for(int i =0;i<length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] testArr = {3,5,3,5,1,2,22,46,3,4};
        int result = indexOfTarget(testArr, 23);
        if(result == -1){
            System.out.println("Không tìm thấy vị trí");
        }
        else{
            System.out.println("Tìm được vị trí: " + result);
        }
    }
}