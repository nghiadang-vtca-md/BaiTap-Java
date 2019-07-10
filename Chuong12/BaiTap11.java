/**
 * BaiTap11
 */
public class BaiTap11 {
    public static int[] letterHist(String s){
        int[] counts = new int[200];
        String ss = s.toLowerCase();
        int length = ss.length();
        for(int i=0;i<length;i++){
            char c = ss.charAt(i);
            int index = (int)c;
            counts[index]++; 
        }
        return counts;
    }

    public static int[] letterHist2(String s){
        int[] counts = new int[26];
        String ss = s.toLowerCase();
        int length = ss.length();
        String az = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++){
            for(int j=0;j<length;j++){
                if(az.charAt(i) == ss.charAt(j)){
                    counts[i]++;
                }
            }
        }
        return counts;
    }
    public static void printHistogram2(int[] arr){
        int length = arr.length;
        for(int i=0;i<length;i++){
            System.out.println(i + "\t" + (char)(i+97) + "\t" + arr[i]);
        }
    }
    public static void printHistogram(int[] arr){
        //int length = arr.length;
        // for(int i=0;i<length;i++){
        //     System.out.println(i + "\t" + (char)i + "\t" + arr[i]);
        // }
        // Chỉ in từ a-z
        for(int i=97;i<=122;i++){
            if(arr[i] != 0){
                System.out.println(i + "\t" + (char)i + "\t" + arr[i]);
            }
        }
    }
    public static void main(String[] args){
        String txt = "DangDucNghia";
        int[] result = letterHist2(txt);
        printHistogram2(result);
    }
}