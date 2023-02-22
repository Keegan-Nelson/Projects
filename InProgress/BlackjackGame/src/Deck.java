import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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

            // Suit[] values = Suit.values();
            // for (int i = 0; i < values.length; i++) {
            //     Suit suit; 
            //     Rank rank; 
            //     playingDeck.add(new Card(suit, rank));
            // }

            for(Suit suit : Suit.values()){
                //Go through all the ranks
                for(Rank rank : Rank.values()){
                    //add a new card containing each iterations suit and rank
                    playingDeck.add(new Card(suit, rank));
                }
            }
        }
    }

    //Shuffle the deck
    public void shuffle(){
        Collections.shuffle(playingDeck, new Random());
    }   

    public Card takeCard(){

        //Take a copy of the first card from the deck
        Card cardToTake = new Card(playingDeck.get(0));
        //Remove the card from the deck
        playingDeck.remove(0);
        //Give the card back
        return cardToTake;


}
}