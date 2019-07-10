import java.util.Random;

/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */


public class BaiTap1n {
    /*
     * Test code.
     */
    public static void main(String[] args) {
	Deck deck = new Deck();
	// Test merge
    Deck.shuffleDeck(deck);
    Deck sub1 = Deck.subdeck(deck, 8, 12);
    System.out.println("");
    Deck sub2 = Deck.subdeck(deck, 18, 22);
    System.out.println("");
    Deck.printDeck(sub1);
    Deck.printDeck(sub2);
    Deck deckMerge = Deck.merge(sub1, sub2);
    Deck.printDeck(deckMerge);
    System.out.println("");
	// check sortDeck
	Deck.shuffleDeck(deck);
	Deck.sortDeck(deck);
	checkSorted(deck);

	// check that findBisect finds each card
	int index;
	for (int i=0; i<52; i++) {
	    index = Deck.findBisect(deck, deck.cards[i], 0, 
				    deck.cards.length-1);
	    if (index != i) {
		System.out.println("Not found!");
	    }
	}
	
	// make a subdeck
	Deck hand = Deck.subdeck(deck, 8, 12);
	Deck.printDeck(hand);

	// check that findBisect doesn't find a card that's not there
	Card badCard = new Card(1, 1);
	index = Deck.findBisect(hand, badCard, 0, hand.cards.length-1);
	if (index != -1) {
	    System.out.println("Found?");
	}

	// check mergeSort
	Deck.shuffleDeck(deck);
	deck = Deck.mergeSort(deck);
	checkSorted(deck);
    }

    /*
     * Checks that the deck is sorted.
     */
    public static void checkSorted(Deck deck) {
	for (int i=0; i<51; i++) {
	    int flag = Card.compareCards(deck.cards[i], deck.cards[i+1]);
	    if (flag != -1) {
		System.out.println("Not sorted!");
	    }
	}
    }
}

/*
 * A Card represents a playing card with rank and suit.
 */
class Card {
    int suit, rank;

    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
			   "7", "8", "9", "10", "Jack", "Queen", "King" };

    /*
     * No-argument constructor.
     */
    public Card() { 
	this.suit = 0;  this.rank = 0;
    }

    /*
     * Constructor with arguments.
     */
    public Card(int suit, int rank) { 
	this.suit = suit;  this.rank = rank;
    }

    /*
     * Prints a card in human-readable form.
     */
    public static void printCard(Card c) {
	System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }

    /*
     * Return true if the cards are equivalent.
     */
    public static boolean sameCard(Card c1, Card c2) {
	return (c1.suit == c2.suit && c1.rank == c2.rank);
    }

    /*
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public static int compareCards(Card c1, Card c2) {

	// first compare the suits
	if (c1.suit > c2.suit) return 1;
	if (c1.suit < c2.suit) return -1;

	// if the suits are the same,
	// use modulus arithmetic to rotate the ranks
	// so that the Ace is greater than the King.
	// WARNING: This only works with valid ranks!
	int rank1 = (c1.rank + 11) % 13;
	int rank2 = (c2.rank + 11) % 13;
	
	// compare the rotated ranks

	if (rank1 > rank2) return 1;
	if (rank1 < rank2) return -1;
	return 0;
    }
}


/*
 * A Deck contains an array of cards.
 */
class Deck {
    Card[] cards;

    /*
     * Makes a Deck with room for n Cards (but no Cards yet).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /*
     * Makes an array of 52 cards.
     */
    public Deck() {
	this.cards = new Card [52];
	
	int index = 0;
	for (int suit = 0; suit <= 3; suit++) {
	    for (int rank = 1; rank <= 13; rank++) {
		this.cards[index] = new Card(suit, rank);
		index++;
 	    }
	}
    }

    /*
     * Prints a deck of cards.
     */
    public static void printDeck(Deck deck) {
	for (int i=0; i<deck.cards.length; i++) {
	    Card.printCard(deck.cards[i]);
	}
    }

    /*
     * Returns index of the first location where card appears in deck.
     * Or -1 if it does not appear.  Uses a linear search.
     */
    public static int findCard (Deck deck, Card card) {
	for (int i = 0; i< deck.cards.length; i++) {
	    if (Card.sameCard(card, deck.cards[i])) {
		return i;
	    }
	}
	return -1;
    }

    /*
     * Returns index of a location where card appears in deck.
     * Or -1 if it does not appear.  Uses a bisection search.
     *
     * Searches from low to high, including both.
     *
     * Precondition: the cards must be sorted from lowest to highest.
     */
    public static int findBisect(Deck deck, Card card, int low, int high) {
	if (high < low) return -1;

	int mid = (high + low) / 2;
	int comp = Card.compareCards(card, deck.cards[mid]);

	if (comp == 0) {
	    return mid;
	} else if (comp < 0) {
	    // card is less than deck.cards[mid]; search the first half
	    return findBisect(deck, card, low, mid-1);
	} else {
	    // card is greater; search the second half
	    return findBisect(deck, card, mid+1, high);
	}
    }

    /*
     * Chooses a random integer between low and high, including low,
     * not including high. 
     */
    public static int randInt(int low, int high) {
        Random r = new Random();
    	return r.nextInt(high-low)+low;
    }

    /*
     * Swaps two cards in a deck of cards.
     */
    public static void swapCards(Deck deck, int i, int j) {
        Card card1 = deck.cards[i];
        Card card2 = deck.cards[j];
        Card temp = new Card(card1.suit,card1.rank);
        card1.suit = card2.suit;
        card1.rank = card2.rank;
        card2.suit = temp.suit;
        card2.rank = temp.rank;
    }

    /*
     * Shuffles the cards in a deck.
     */
    public static void shuffleDeck(Deck deck) {
        for(int i=0;i<deck.cards.length;i++){
            int randomPosition = randInt(1,deck.cards.length-1);
            swapCards(deck,i,randomPosition);
        }
    }

    /*
     * Sorts a deck from low to high.
     */
    public static void sortDeck(Deck deck) {
        int length = deck.cards.length;
        for(int i=0;i<length;i++){
            int indexLowestCard = indexLowestCard(deck,i,length-1);
            swapCards(deck,i,indexLowestCard);
        }
    }

    /*
     * Finds the index of the lowest card between low and high,
     * including both.
     */
    public static int indexLowestCard(Deck deck, int low, int high) {
        int result = -1;
        Card lowestCard = deck.cards[low];
        for(int i=low;i<=high;i++){
            int comp = Card.compareCards(deck.cards[i],lowestCard);
            if(comp == -1 || comp ==0){
                lowestCard = deck.cards[i];
                result = i;
            }
        }
	    return result;
    }

    /*
     * Makes a new deck of cards with a subset of cards from the original.
     * The old deck and new deck share references to the same card objects.
     */
    public static Deck subdeck(Deck deck, int low, int high) {
	Deck sub = new Deck(high-low+1);
	
	for (int i = 0; i<sub.cards.length; i++) {
	    sub.cards[i] = deck.cards[low+i];
	}
	return sub;
    }

    /*
     * Merges two sorted decks into a new sorted deck.
     */
    // Cách 1:
    // public static Deck merge(Deck d_1, Deck d_2) {
    //     Deck d1 = subdeck(d_1, 0, d_1.cards.length-1);
    //     Deck d2 = subdeck(d_2, 0, d_2.cards.length-1);
    //     // Sắp xếp trước khi merge
    //     sortDeck(d1);
    //     sortDeck(d2);
    //     // Tạo bộ bài mới bằng tổng 2 bộ con 
    //     Deck result = new Deck(d1.cards.length + d2.cards.length);
    //     // i là phần thứ 1
    //     // j là phần thứ 2
    //     int i=0;
    //     int j=0;
    //     for(int k=0;k<result.cards.length;k++){
    //         if(i == d1.cards.length || j == d2.cards.length){
    //            if(i == d1.cards.length){
    //                 for(int a=j;a<d2.cards.length;a++){
    //                     result.cards[k] = new Card(d1.cards[a].suit,d1.cards[a].rank);
    //                 }
    //                 return result;
    //            }
    //            if(j == d2.cards.length){
    //                 for(int b=i;b<d1.cards.length;b++){
    //                     result.cards[k] = new Card(d2.cards[b].suit,d1.cards[b].rank);
    //                 }
    //                 return result;
    //            }
    //         }
    //         else{
    //             int comp = Card.compareCards(d1.cards[i],d2.cards[j]);
    //             if(comp == -1){
    //                 result.cards[k] = new Card(d1.cards[i].suit,d1.cards[i].rank);
    //                 i++;
    //             }
    //             else{
    //                 result.cards[k] = new Card(d1.cards[j].suit,d1.cards[j].rank);
    //                 j++;
    //             }
    //         }
    //     }
	//     return result;
    // }
    // Cách 2:
    public static Deck merge(Deck d1,Deck d2){
        // Tạo deck mới bằng tổng 2 deck
        Deck result = new Deck(d1.cards.length + d2.cards.length);
        
        int choice; // 1: d1 , 2: d2
        int i = 0;  // i là phần tử của d1
        int j = 0;  // j là phần tử của d2
        // k là phần tử của result
        for(int k=0;k<result.cards.length;k++){
            choice = 1;

            // Nếu d1 rỗng thì lần lượt thêm d2 vào result
            // Nếu d2 rỗng thì lần lượt thêm d1 vào result
            // Ngược lại thì so sánh: bài nhỏ được xếp vào deck result
            if(i == d1.cards.length){
                choice = 2;
            }
            else if(j == d2.cards.length){
                choice = 1;
            }else if(Card.compareCards(d1.cards[i], d2.cards[j]) > 0){
                choice = 2; // Vì d1 > d2
            }

            // Thêm bài nhỏ vào deck result
            if(choice == 1){
                result.cards[k] = d1.cards[i];
                i++;
            }else{
                result.cards[k] = d2.cards[j];
                j++;
            }
        }
        return result;
    }
    /*
     * Sort the Deck using merge sort.
     */
    public static Deck mergeSort(Deck deck) {
        if (deck.cards.length < 2) {
            return deck;
        }
        int mid = (deck.cards.length-1) / 2;
        
        // divide the deck roughly in half
        Deck d1 = subdeck(deck, 0, mid);
        Deck d2 = subdeck(deck, mid+1, deck.cards.length-1);
        
        // sort the halves
        d1 = mergeSort(d1);
        d2 = mergeSort(d2);
        
        // merge the two halves and return the result
        // (d1 and d2 get garbage collected)
        return merge(d1, d2);
    }
}