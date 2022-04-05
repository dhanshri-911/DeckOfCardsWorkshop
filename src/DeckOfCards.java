import java.util.Random;

public class DeckOfCards extends Players {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
    String[] deck = new String[52];

    public void cardCombination(){
            for (int i = 0; i < deck.length; i++) {
                deck[i] = ranks[i % 13] + " " + suits[i / 13];
                System.out.println(deck[i]);
            }
        }
    public void shuffle(String deck[]) {
        for ( int i = deck.length-1; i > 0; i-- ) {
            Random random1 = new Random();
            int rand = random1.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }
    public void printCard() {
        for (int k = 0; k < 52; k++)
            System.out.print(deck[k] + ",");
    }

    public static void main(String[] args) {
            DeckOfCards deckOfCards = new DeckOfCards();
            Players players = new Players();
            deckOfCards.cardCombination();
            deckOfCards.shuffle(deckOfCards.deck);
            System.out.println("Shuffled card combinations are: ");
            deckOfCards.printCard();
    }
}


