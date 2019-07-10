/**
 * BaiTap12
 */
public class BaiTap12 {
    public static boolean isDoubloon(String s){
        String ss = s.toLowerCase();
        int length = ss.length();
        for(int i=0;i<length;i++){
            int count =0;
            for(int j=0;j<length;j++){
                if(ss.charAt(i) == ss.charAt(j)){
                    count++;
                }
            }
            if(count!=2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] listTest = {"Abba", "Anna", "appalleee", "appearer", "appeases", "arraigning", "beriberi", "bilabial", "boob", "Caucasus", "coco", "Dada","deed", "Emmett"};
        for(int i=0;i<listTest.length;i++){
            System.out.println(isDoubloon(listTest[i]));
        }
    }
}