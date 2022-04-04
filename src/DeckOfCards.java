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
        public static void main(String[] args) {
            DeckOfCards deckOfCards = new DeckOfCards();
            Players players = new Players();
           // deckOfCards.cardCombination();
            players.getPlayers();
    }
}


