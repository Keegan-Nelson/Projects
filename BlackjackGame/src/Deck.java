import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> playingDeck;

    public Deck(){
        playingDeck = new ArrayList<Card>();
    }
    public void addCard(Card card){
        playingDeck.add(card);
    }
    
    public String toString(){
        //A string to hold everything we're going to return
        String output = "";
    
        //for each Card "card" in the deck
        for(Card card: playingDeck){
            //add the card and the escape character for a new line
            output += card;
            output += "\n";
        }
        return output;
    }

    public Deck(boolean makeDeck){
        playingDeck = new ArrayList<Card>();
        if(makeDeck){
            //Go through all the suits

            for (int i = 0; i < Suit.values(); i++) {

            }
            for(Suit suit : Suit.values()){
                //Go through all the ranks
                for(Rank rank : Rank.values()){
                    //add a new card containing each iterations suit and rank
                    playingDeck.add(new Card(suit, rank));
                }
            }
        }
    }
}