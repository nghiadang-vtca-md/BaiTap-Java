/**
 * BaiTap3
 */
public class BaiTap3 {
    public static int randomInt(int low,int high){
        double result = Math.random();
        result = low * (1-result) + (high - 1) * result;
        return (int)result;
    }
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            int x = randomInt(30, 40);
            System.out.println(x);
        }
    }
}