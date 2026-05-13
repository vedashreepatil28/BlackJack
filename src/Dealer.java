public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;

    public Dealer(){
        cardTotal = 2;
        isBust = false;
        isOver15 = false;

        printDealer();
    }
    public void printDealer(){
        System.out.println("the Dealer has " + cardTotal + " cards. It is " + isOver15 +" that the dealer has to hit. It is " +  isBust + " that the hand is bust.");
    }

    public void hit() {

    }
    public void stand() {

    }
}
