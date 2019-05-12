package cn.edu.xjtu.se.ly;

public class main {
    public static void main(String[] args) {
        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.SIX,Suit.DIAMOND),new Card(Rank.TWO,Suit.SPADE),
                new Card(Rank.SIX,Suit.CLUB),new Card(Rank.TWO,Suit.DIAMOND)};
        Card[] White={new Card(Rank.FOUR,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.THREE,Suit.SPADE),
                new Card(Rank.FOUR,Suit.CLUB),new Card(Rank.THREE,Suit.DIAMOND)};
        /*

        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.KING,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.DIAMOND),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FIVE,Suit.CLUB),
                new Card(Rank.NINE,Suit.SPADE),new Card(Rank.KING,Suit.HEART)};


        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.KING,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.CLUB ),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),
                new Card(Rank.EIGHT,Suit.CLUB),new Card(Rank.KING,Suit.HEART)};


        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),new Card(Rank.FOUR,Suit.CLUB),
                new Card(Rank.TWO,Suit.DIAMOND),new Card(Rank.FOUR,Suit.HEART)};
       Card[] White={new Card(Rank.TWO,Suit.SPADE ),new Card(Rank.EIGHT,Suit.SPADE),new Card(Rank.ACE,Suit.SPADE),
               new Card(Rank.QUEEN,Suit.SPADE),new Card(Rank.THREE,Suit.SPADE)};

       Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.TEN,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.CLUB ),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),
                new Card(Rank.EIGHT,Suit.CLUB),new Card(Rank.ACE,Suit.HEART)};
       */
        CardSet cs1=new CardSet(Black);
        CardSet cs2=new CardSet(White);
         if (cs1.compareTo(cs2)==1){
            System.out.println("Black wins");
        }
        else if (cs1.compareTo(cs2)==-1){
            System.out.println("White wins");
        }
        else
            System.out.println("Tie");

    }
}

