class Card{ 
    int suit, rank;

    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    public Card(int _suit, int _rank){
       this.suit = _suit;
       this.rank = _rank;
    }
}
// Bài tập 2 Chương 13
public class BaiTap2 {
    // Hàm tạo bộ bài 52 lá
    public static Card[] makeDeck(){
        Card[] cards = new Card[52];
        int index=0;
        for(int suit=0;suit<4;suit++){
            for(int rank=1;rank<14;rank++){
                cards[index] = new Card(suit,rank);
                index++;
            }
        }
        return cards;
    }
    // Hàm in tên lá bài
    public static void printCard(Card c){
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        String[] ranks = {"None", "Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }
    public static void main(String[] args) {
        Card[] deck = makeDeck();
        for(int i=0;i<52;i++){
            printCard(deck[i]);
        }
    }
}