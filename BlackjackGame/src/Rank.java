public enum Rank {

    Two(" ___ " + "\n" + "|2  |" + "\n" + "|   |" + "\n" + "|___|", 2),
    Three("Three", 3),
    Four("Four", 4),
    Five("Five", 5),
    Six("Six", 6),
    Seven("Seven", 7),
    Eight("Eight", 8),
    Nine("Nine", 9),
    Ten("Ten", 10),
    Jack("Jack", 10),
    Queen("Queen", 10),
    King("King", 10),
    Ace("Ace", 11 );   // How can we make this a choice of 11 or 1 (Maybe when a player goes over 21 but their hand incldes an Ace turn it into a 1)


    String rankName;
    int rankNumber;

    Rank(String rankName, int rankNumber) {
        this.rankName = rankName;
        this.rankNumber = rankNumber; 
    }

    public String toString(){
        return rankName;
    }
}


// // Template With Suit
//  ___ 
// |2  | 
// | H |   
// |___|

// // Template Without Suit
//  ___
// |2  | 
// |   |   
// |___|
 