package cn.edu.xjtu.se.ly;
import org.junit.Assert;
import org.junit.Test;
public class TestPoker {
    @Test
    public void fullhousetest() {
        Card[] Black = {new Card(Rank.TWO, Suit.HEART), new Card(Rank.SIX, Suit.DIAMOND), new Card(Rank.TWO, Suit.SPADE),
                new Card(Rank.SIX, Suit.CLUB), new Card(Rank.TWO, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.FOUR, Suit.HEART), new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.SPADE),
                new Card(Rank.FOUR, Suit.CLUB), new Card(Rank.THREE, Suit.DIAMOND)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void paironetest() {
        Card[] Black = {new Card(Rank.TWO, Suit.HEART), new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.FIVE, Suit.SPADE),
                new Card(Rank.NINE, Suit.CLUB), new Card(Rank.TWO, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.HEART), new Card(Rank.FIVE, Suit.CLUB),
                new Card(Rank.NINE, Suit.SPADE), new Card(Rank.KING, Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void pairtwotest() {
        Card[] Black = {new Card(Rank.TWO, Suit.HEART), new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.FIVE, Suit.SPADE),
                new Card(Rank.NINE, Suit.CLUB), new Card(Rank.TWO, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.HEART), new Card(Rank.FIVE, Suit.CLUB),
                new Card(Rank.NINE, Suit.SPADE), new Card(Rank.KING, Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void straighttest() {
        Card[] Black = {new Card(Rank.TWO, Suit.HEART), new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.FIVE, Suit.SPADE),
                new Card(Rank.FOUR, Suit.CLUB), new Card(Rank.SIX, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.FOUR, Suit.HEART), new Card(Rank.FIVE, Suit.CLUB),
                new Card(Rank.SIX, Suit.SPADE), new Card(Rank.SEVEN, Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void fourtest() {
        Card[] Black = {new Card(Rank.TWO, Suit.HEART), new Card(Rank.TWO, Suit.DIAMOND), new Card(Rank.TWO, Suit.SPADE),
                new Card(Rank.FOUR, Suit.CLUB), new Card(Rank.TWO, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.HEART), new Card(Rank.THREE, Suit.CLUB),
                new Card(Rank.SIX, Suit.SPADE), new Card(Rank.THREE, Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void threetest() {
        Card[] Black = {new Card(Rank.FIVE, Suit.HEART), new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.FIVE, Suit.SPADE),
                new Card(Rank.FOUR, Suit.CLUB), new Card(Rank.SEVEN, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.HEART), new Card(Rank.THREE, Suit.CLUB),
                new Card(Rank.SIX, Suit.SPADE), new Card(Rank.FIVE, Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(1, result);
    }
    @Test
    public void flushtest() {
        Card[] Black = {new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.SEVEN, Suit.DIAMOND), new Card(Rank.EIGHT, Suit.DIAMOND),
                new Card(Rank.FOUR, Suit.DIAMOND), new Card(Rank.TWO, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.TWO, Suit.DIAMOND), new Card(Rank.THREE, Suit.DIAMOND), new Card(Rank.THREE, Suit.DIAMOND),
                new Card(Rank.FOUR, Suit.DIAMOND), new Card(Rank.FOUR, Suit.DIAMOND)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(1, result);
    }
    @Test
    public void straightflushtest() {
        Card[] Black = {new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.SEVEN, Suit.DIAMOND), new Card(Rank.SIX, Suit.DIAMOND),
                new Card(Rank.FOUR, Suit.DIAMOND), new Card(Rank.THREE, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.TWO, Suit.DIAMOND), new Card(Rank.FIVE, Suit.DIAMOND), new Card(Rank.THREE, Suit.DIAMOND),
                new Card(Rank.SIX, Suit.DIAMOND), new Card(Rank.FOUR, Suit.DIAMOND)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(1, result);
    }
    @Test
    public void hightest() {
        Card[] Black = {new Card(Rank.FIVE, Suit.HEART), new Card(Rank.SEVEN, Suit.SPADE), new Card(Rank.TWO, Suit.DIAMOND),
                new Card(Rank.FOUR, Suit.DIAMOND), new Card(Rank.THREE, Suit.DIAMOND)};
        Card[] White = {new Card(Rank.TWO, Suit.SPADE), new Card(Rank.FOUR, Suit.DIAMOND), new Card(Rank.SIX, Suit.DIAMOND),
                new Card(Rank.SEVEN, Suit.DIAMOND), new Card(Rank.EIGHT, Suit.SPADE)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void tietest() {
        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.KING,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.DIAMOND),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FIVE,Suit.CLUB),
                new Card(Rank.NINE,Suit.SPADE),new Card(Rank.KING,Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(0, result);
    }
    @Test
    public void other1test() {
        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.TEN,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.CLUB ),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),
                new Card(Rank.EIGHT,Suit.CLUB),new Card(Rank.ACE,Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(-1, result);
    }
    @Test
    public void other2test() {
        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),new Card(Rank.FOUR,Suit.CLUB),
                new Card(Rank.TWO,Suit.DIAMOND),new Card(Rank.FOUR,Suit.HEART)};
        Card[] White={new Card(Rank.TWO,Suit.SPADE ),new Card(Rank.EIGHT,Suit.SPADE),new Card(Rank.ACE,Suit.SPADE),
                new Card(Rank.QUEEN,Suit.SPADE),new Card(Rank.THREE,Suit.SPADE)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(1, result);
    }
    @Test
    public void other3test() {
        Card[] Black={new Card(Rank.TWO,Suit.HEART),new Card(Rank.THREE,Suit.DIAMOND),new Card(Rank.FIVE,Suit.SPADE),
                new Card(Rank.NINE,Suit.CLUB),new Card(Rank.KING,Suit.DIAMOND)};
        Card[] White={new Card(Rank.TWO,Suit.CLUB ),new Card(Rank.THREE,Suit.HEART),new Card(Rank.FOUR,Suit.SPADE),
                new Card(Rank.EIGHT,Suit.CLUB),new Card(Rank.KING,Suit.HEART)};
        CardSet cs1 = new CardSet(Black);
        CardSet cs2 = new CardSet(White);
        int result = cs1.compareTo(cs2);
        Assert.assertEquals(1, result);
    }
}


