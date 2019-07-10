class Card {
    int suit, rank;

    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    public Card(int _suit, int _rank) {
        this.suit = _suit;
        this.rank = _rank;
    }
}

// Bài tập 3 Chương 13
public class BaiTap3 {
    // Hàm in tên lá bài
    public static void printCard(Card c) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "None", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }
    // Tính tổng điểm của mảng
    public static int handScore(Card[] cards){
        int sum = 0;
        int length = cards.length;
        for(int i=0;i<length;i++){
            int rankOfCard = cards[i].rank;
            if(rankOfCard > 10){
                sum += 10;
            }
            else{
                sum += rankOfCard;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //Card[] yourCards = new Card[4];
        Card card1 = new Card(3,1);
        Card card2 = new Card(3,10);
        Card card3 = new Card(3,11);
        Card card4 = new Card(3,3);
        Card[] yourCards = {card1,card2,card3,card4};

        for(int i=0;i<yourCards.length;i++){
            printCard(yourCards[i]);
        }

        System.out.println("Your score is " + handScore(yourCards));
    }

}