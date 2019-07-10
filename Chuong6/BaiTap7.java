/**
 * BaiTap7
 */
public class BaiTap7 {
    public static int A(int m,int n) {
        if(m==0){
            //System.out.println("m=0");            
            return n + 1;
        }
        else if(m>0 && n ==0){
            //System.out.println("m>0 && n=0");            
            return A(m-1,1);
        }
        else if(m>0 && n>0){
            //System.out.println("m>0 && n>0");            
            return A(m-1,A(m,n-1));
        }
        else{
            return 223;
        }
    }
    public static void main(String[] args) {
        System.out.println(A(3,1));
    }
}