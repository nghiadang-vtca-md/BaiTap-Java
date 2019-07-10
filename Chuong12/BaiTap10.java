/**
 * BaiTap10
 */
public class BaiTap10 {
    // Câu 1:
    public static int indexOfMaxInRange(int[] arr, int lowIndex, int highIndex){
        int index = lowIndex;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        while(index <= highIndex){
            if(arr[index] > max){
                max = arr[index];
                maxIndex = index;
            }
            index++;
        }
        return maxIndex;
    }
    // Câu 2:
    public static void swapElement(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // Câu 3:
    public static void selectionSort(int[] arr){
        int length = arr.length;
        for(int i = length -1;i>0;i--){
            swapElement(arr, i, indexOfMaxInRange(arr, 0, i));
        }
    }
    public static void main(String[] args){
        // Test Câu 1:
        int[] testArr = {13,4,12,4,3,14,25,5,3,4,5};
        int max = indexOfMaxInRange(testArr, 1, 5);
        System.out.println(max);
        // Test Câu 2:
        // int length = testArr.length;
        // swapElement(testArr, 0, 10);
        // for(int i=0;i<length;i++){
        //     System.out.println(i + "\t" + testArr[i]);
        // }
        // Test Câu 3:
        int length = testArr.length;
        selectionSort(testArr);
        for(int i=0;i<length;i++){
            System.out.println(i + "\t" + testArr[i]);
        }
    }
}