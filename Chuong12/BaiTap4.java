/**
 * BaiTap4
 */
public class BaiTap4 {
    
    public static int[] makeHist(int[] scores){
        int[] counts = new int[100];
        int lengthOFScores = scores.length;
        for(int i=0;i<lengthOFScores;i++){
            int index = scores[i];
            counts[index]++;
        }
        return counts;
    }

    public static int randomInt2(int low,int high){
        double result = Math.random();
        result = low * (1-result) + (high - 1) * result;
        return (int)result;
    }

    public static void main(String[] args){
        int[] scores = new int[200];
        for(int i=0;i<200;i++){
            scores[i] = randomInt2(40, 101);
        }

        int[] result = makeHist(scores);

        for(int i=40;i<100;i++){
            System.out.println(i + "\t" + result[i]);
        }
    }
}