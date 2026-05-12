public class BasicGameApp {
    public Player me;
    public Dealer d;
    public Card[] deck;

    public static void main(String[] args) {
    new BasicGameApp();
    }
    public BasicGameApp(){
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];
        printInfo();
    }
    public void printInfo(){
        for (int i = 0; i<13; i++){
            deck[i] = new Card("diamonds",1,i);
            deck[i].printInfo();
        }
    }


    public void compare() {

    }
    public void round() {

    }
    public void shuffle() {

    }

}
