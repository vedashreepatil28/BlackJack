public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;

    public Dealer(){
        cardTotal = 2;
        isBust = false;
        isOver15 = false;
        hand = new Card[2];


    }
    public void printDealer(){
        System.out.println("cardTotal: " + cardTotal);
        System.out.println("isBust: " + isBust);
        System.out.println("isOver15: " + isOver15);

        for (int s = 0; s<hand.length; s++){
            hand[s].printInfo();
        }
    }

    public void calculateTotal(){
        cardTotal = 0;
        for (int f=0; f<hand.length; f++){
            cardTotal += hand[f].value;
        }
    }


    public void hit() {

    }
    public void stand() {

    }
}
