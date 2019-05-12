package cn.edu.xjtu.se.ly;

import java.util.Arrays;
import java.util.Comparator;

public class CardSet implements Comparable {
    private Card[] cards = new Card[5];
    public CardSet(Card[] cards) {
        this.cards = cards;
        Arrays.sort(cards, new cmp());//升序排i序
    }

    public int getvalue(int i){//获得第i个牌的值
      Card c= cards[i];
     return c.getRank().getR();

    }
    public boolean isHigh() {//散牌
      if(isFlush()|isStraightFlush()|isStraight() |isFullHouse()|isThree()|isFour()|getPair() == 2|getPair() == 1)
          return false;
      else
          return true;
    }
    public int comparemiddle(Object o) {//比较中间值
        if (this.getvalue(2)>((CardSet) o).getvalue(2))
        return 1;
        else return -1;
    }
    public int comparehigh(Object o) {
        for(int i=1;i<5;i++){
            if (this.getvalue(5-i)!=((CardSet) o).getvalue(5-i)){
               if (this.getvalue(5-i)>((CardSet) o).getvalue(5-i)){
                   return 1;
               }
               else return -1;
            }
        }
           return 0;
    }
    public int getPair() {//判断有多少对一样的牌
        int res = 0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(cards[i].getRank()==cards[j].getRank())
                    res++;
            }
        }
        return res;
    }
    public int getPairone() {//得到一对一样的牌
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(cards[i].getRank().getR()==cards[j].getRank().getR())
                return cards[i].getRank().getR();
            }
        }
        return 0;
    }
    public int[] getPairtwo() {//得到两对一样的牌并从小到大排序
        int res=0;
        int[] pairArray={};
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(cards[i].getRank().getR()==cards[j].getRank().getR())
                   pairArray[res]=cards[res].getRank().getR();
                   res++;}
            }
        if (pairArray[0]>pairArray[1]){
            int a=pairArray[0];
            pairArray[1]=a;
            pairArray[0]=pairArray[1];
        }

        return pairArray;
    }
    public int comparePairtwo(Object o) {
        for(int i=0;i<2;i++) {
            if (this.getPairtwo()[i] != ((CardSet) o).getPairtwo()[i]) {
                if (this.getPairtwo()[i] > ((CardSet) o).getPairtwo()[i]) {
                    return 1;
                } else if (this.getPairtwo()[i] < ((CardSet) o).getPairtwo()[i]) {
                    return -1;
                }
            }
        }
       return this.comparehigh(o);
    }




    public int comparePairone(Object o) {//比较判断一对一样的牌
       if(this.getPairone()!=((CardSet) o).getPairone()) {
           if (this.getPairone() > ((CardSet) o).getPairone()) {
               return 1;
           } else return -1;
       }
           else {
              for(int i=0;i<5;i++){
                   if(this.cards[i].getRank().getR()>((CardSet) o).cards[i].getRank().getR()){
                            return 1;
                   }
                   else if(this.cards[i].getRank().getR()<((CardSet) o).cards[i].getRank().getR()){
                          return -1;
                   }
               }


       }



    public boolean isThree() {//三条
        return (getPair()==3);
    }//三条

    public boolean isStraight() {//顺子
        int a = cards[4].getRank().getR() - cards[3].getRank().getR();
        int b = cards[3].getRank().getR() - cards[2].getRank().getR();
        int c = cards[2].getRank().getR() - cards[1].getRank().getR();
        int d = cards[1].getRank().getR() - cards[0].getRank().getR();
        if (a == b && b == c && c == d) {
            return true;
        } else if (a == b && b == c && d == 9) {
           // return 2;
            return true;
        }
        return false;
    }
    public boolean isFlush() {//同花
        for (int i = 0; i < 4; i++) {
            if (cards[i].getSuit() != cards[i + 1].getSuit())
                return false;
        }
        return true;
    }
    public boolean isFullHouse() {//葫芦
        return (getPair() == 4);
    }//葫芦


    public boolean isFour() {//铁支
        return (getPair()==6);
    }//铁支

    public boolean isStraightFlush() {//同花顺
        return (isStraight()) && isFlush();
    }


    public int getPoints() {
        if (isStraightFlush())
            return 90;
        else if (isFour())
            return 80;
        else if (isFullHouse())
            return 70;
        else if (isFlush())
            return 60;
        else if (isStraight())
            return 50;
        else if (isThree())
            return 40;
        else if (getPair() == 2)
            return 30;
        else if (getPair() == 1)
            return 20;
        else
            return 10;
    }

    public int comparelevelTo(Object o) {

          if (isFour()|isThree()|isFullHouse()){
              return comparemiddle(o);
        }
          else if (isStraight()|isStraightFlush()|isHigh()|isFlush()) {
             return comparehigh(o);
          }
         else if (getPair()==2) {
                 return comparePairtwo(o);
          }
         else if (getPair()==1) {
              return comparePairone(o);
          }

        return 0;
    }





    @Override
    public int compareTo(Object o) {

        if (this.getPoints() != ((CardSet) o).getPoints()) {
            if (this.getPoints() > ((CardSet) o).getPoints())
                return 1;
            else
                return -1;
        } else
           // return 0;
            return this.comparelevelTo(o);
    }

    //排序比较器
    class cmp implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Card c1 = (Card) o1;
            Card c2 = (Card) o2;
            if (c1.getRank().getR() != c2.getRank().getR())
                return c1.getRank().getR() > c2.getRank().getR() ? 1 : -1;
            else
                return 0;
        }
    }
}
