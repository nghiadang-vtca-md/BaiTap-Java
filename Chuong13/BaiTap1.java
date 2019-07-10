/**
 * BaiTap1
 */
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

    public static void printCard(Card c){
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        String[] ranks = {"None", "Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }

    public static int compareCard(Card c1, Card c2){
        if(c1.suit > c2.suit) return 1;
        if(c1.suit < c2.suit) return -1;

        if(c1.rank > c2.rank){
            if(c2.rank == 1) return -1;
            else return 1;
        } 
        if(c1.rank < c2.rank){
            if(c1.rank == 1) return 1;
            else return -1;
        }
        return 0;
    }
}

public class BaiTap1 {

    public static void main(String[] args) {
        System.out.println("Nghia");
        Card card = new Card(3,11);
        Card.printCard(card);
        // 
        Card c1 = new Card(1,13);
        Card c2 = new Card(1,1);
        int result = Card.compareCard(c1,c2);
        System.out.println(result);
    }
}