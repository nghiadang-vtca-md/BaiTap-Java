/**
 * BaiTap12
 */
// 65 -> 90 : A - Z
// 97 -> 122 : a - z
public class BaiTap12 {
    public static String Encrypt(String input,int shift){
        int len = input.length();
        int index = 0;
        String result = "";
        while(index < len){
            char ch = input.charAt(index);
            int ch_Int = (int)ch;
            if(ch_Int >= 65 && ch_Int <= 90){
                if(90 - ch_Int < shift ){
                    ch_Int = shift - (90 - ch_Int) + 65 - 1;
                    result += (char)ch_Int;
                    index++;
                }
                else{
                    ch_Int = ch_Int + shift;
                    result+= (char)ch_Int;
                    index++;
                }
            }
            else if(ch_Int >= 97 && ch_Int <= 122){
                if(122 - ch_Int < shift){
                    ch_Int = shift - (122 - ch_Int) + 97 -1;
                    result+= (char)ch_Int;
                    index++;
                }
                else{
                    ch_Int = ch_Int + shift;
                    result+= (char)ch_Int;
                    index++;
                }
            }
            else{
                result+=ch;
                index++;
                continue;
            }
        }
        return result;
    }
    public static void printAlphabet(){
        int count = 0;
        int count2 = 0;
        for(int i = 65;i<=90;i++){
            System.out.print(i + " - " + (char)i + "\t");
            count++;
            if(count == 13){
                System.out.println();
                count=0;
            }
        }
        System.out.println();
        for(int i = 97;i<=122;i++){
            System.out.print(i + " - " + (char)i + "\t");
            count2++;
            if(count2 == 13){
                System.out.println();
                count2=0;
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        String test = Encrypt("Dang Duc Nghia", 13);
        printAlphabet();
        System.out.println("\n" + test);
    }
}