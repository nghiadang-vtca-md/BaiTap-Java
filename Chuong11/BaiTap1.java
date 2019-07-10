/**
 * BaiTap1
 */

 class Tile{
     char letter;
     int value;
     public Tile(char _letter, int _value){
         this.letter = _letter;
         this.value = _value;
     }
 }
public class BaiTap1 {

    public static void printTile(Tile tile){
        System.out.println("Letter: " + tile.letter);
        System.out.println("Value: " + tile.value);
    }

    public static void testTile(){
        Tile tile = new Tile('z',10);
        printTile(tile);
    }
    public static void main(String[] args) {
        testTile();
        System.out.println("nghhadfa");
    }
}