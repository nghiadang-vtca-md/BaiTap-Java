// Đối tượng lá bài
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

// Bài tập 4 Chương 13
public class BaiTap4 {
    // Hàm in tên lá bài
    public static void printCard(Card c) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "None", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }
    // Hàm phục vụ Câu 4.a : Histogram các chất của nhóm bài
    public static int[] suitHist(Card[] cards){
        int[] counts = new int[4];
        int length = cards.length;
        for(int i=0;i<length;i++){
            int suit = cards[i].suit;
            counts[suit]++;
        }
        return counts;
    }
    // Hàm phục vụ Câu 4.b : Kiểm tra nhóm bài có dây hay không ?
    public static boolean hasFlush(Card[] cards){
        int[] histogram = suitHist(cards);
        for(int i=0;i<histogram.length;i++){
            if(histogram[i] >= 5){
                return true;
            }
        }
        return false;
    }
    // In histogram
    public static void printHistogram(int[] histogram){
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        for(int i=0;i<histogram.length;i++){
            System.out.println(suits[i] + ": " + histogram[i]);
        }
    }
    public static void main(String[] args) {
        //  Tạo lát bài test
        Card card1 = new Card(3,1);
        Card card2 = new Card(3,10);
        Card card3 = new Card(3,11);
        Card card4 = new Card(3,3);
        Card card5 = new Card(2,1);
        Card card6 = new Card(1,10);
        Card card7 = new Card(0,11);
        Card card8 = new Card(0,3);
        Card card9 = new Card(3,7);
        Card card10 = new Card(1,3);
        Card[] yourCards = {card1,card2,card3,card4,card5,card6,card7,card8,card9,card10};
        // test Histogram
        int[] histogram = suitHist(yourCards);
        printHistogram(histogram);
        // test hasFlush
        System.out.println("Has flush: " + hasFlush(yourCards));
    }

}