public enum Suit {
         CLUB("Clubs"), 
        DIAMOND("Diamonds"),
        HEART("Hearts"),
        SPADE("Spades");
    
        String suitName;
    
        Suit(String suitName) {
            this.suitName = suitName;
        }
    
        public String toString(){
            return suitName;
        }
}



// Update this to correlate with rank     Can have a random suit happen each time with a symbol that will add to the rank in Rank.java