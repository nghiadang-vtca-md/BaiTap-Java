/**
 * BaiTap9
 */
public class BaiTap9 {
    public static int maxInRange(int[] arr, int lowIndex, int highIndex){
        // Tính độ dài từ low -> high
        int length = highIndex-lowIndex+1;
        // Tạo mảng mới trong khoảng từ low -> high
        int[] arrInRange = new int[length];
        for(int i=0;i<length;i++){
            arrInRange[i] = arr[lowIndex + i];
        }
        // Điều kiện dừng của đệ quy
        if(1 == length){
            return arr[highIndex];
        }
        // Tìm vị trí giữa của khoảng low -> high
        int middleOfArr = (lowIndex + highIndex)/2;
        // Đệ quy tìm giá trị lớn nhất của mảng bên trái
        int maxOfPart1 = maxInRange(arr, lowIndex, middleOfArr);
        // Đệ quy tìm giá trị lớn nhất của mảng bên phải
        int maxOfPart2 = maxInRange(arr, middleOfArr + 1, highIndex);
        // Tìm giá trị lớn nhất của toàn mảng từ low -> high
        if(maxOfPart1 >= maxOfPart2){
            return maxOfPart1;
        }
        else{
            return maxOfPart2;
        }
    }

    public static double max(int[] arr){
        double max = maxInRange(arr, 0, arr.length-1); 
        return max;
    }

    public static int find(int[] arr, int target){
        
        return 1;
    }

    public static void main(String[] args){
        // Test maxInRange
        int[] testArr = {5,7,4,14,17,19,43,2,6,2,23,53,4};
        int result = maxInRange(testArr,3,7);
        System.out.println(result);
        // Test max 
        double max = max(testArr);
        System.out.println(max);
    }
}