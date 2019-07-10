/**
 * BaiTap1
 */
public class BaiTap1 {
    public static int[] cloneArray(int[] arr){
        int lengthOfArr = arr.length;
        int[] result = new int[lengthOfArr];
        for(int i=0;i<lengthOfArr;i++){
            result[i] = arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] testArr = new int[]{5,12,4,24,5,2,3,5,26,10};
        int[] testCloneArr = cloneArray(testArr);
        System.out.println(testArr);
        System.out.println(testCloneArr);
    }
    
}