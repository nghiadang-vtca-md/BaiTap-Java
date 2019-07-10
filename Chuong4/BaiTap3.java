/**
 * BaiTap3
 */
public class BaiTap3 {
    public static void lyricsOfSong(int times){
        if(times == 0){
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        }
        else{
            System.out.println(times + " bottles of beer on the wall, 99 bottles of beer, ya’ take one down, ya’ pass it around, 98 bottles of beer on the wall.");
            lyricsOfSong(times-1);
        }
    }
    public static void main(String[] args) {
        lyricsOfSong(5);
    }
}