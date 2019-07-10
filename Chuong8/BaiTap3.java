/**
 * BaiTap2
 */
public class BaiTap3 {
    public static int countLetter(String str, char ch){
        int length = str.length();
        int count = 0;
        int index = 0;
        while(index < length){
            if(str.charAt(index) == ch){
                count++;
            }  
            index++;
        }
        return count;
    }

    public static int countLetter_2(String str, char ch){
        int length = str.length();
        int count = 0;
        int index = 0;
        while(index < length){
            int i = str.indexOf(ch,index); // Vị trí của ký tự ch bắt đầu từ vị trí index
            if(i!=-1){                     // Nếu !=-1 thì là có tồn tại ký tự 
                count++;                   // Tăng biến đếm
                index = i;                 // bắt đầu lại từ vị trí tìm được
            }
            index++; 
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Dang a  aa aaaDuc Nghia";
        char ch = 'a';
        System.out.println(countLetter(str, ch));
        System.out.println(countLetter_2(str, ch));
    }
}