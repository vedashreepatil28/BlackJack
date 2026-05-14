import java.util.Scanner;

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
        int counter = 0;
        for(int x = 0; x<4; x++){ //4 suits
            for (int i = 0; i<13; i++){//13 cards per suit
                deck[counter] = new Card(x,1,i);
                counter++;
            }
        }
        shuffle();
        printDeck();
        me = new Player();
        d = new Dealer();
        me.hand[0] = deck[0];
        me.hand[1] = deck[1];
        me.calculateTotal();
        d.hand[0] = deck[2];
        d.hand[1] = deck[3];
        d.calculateTotal();
        //ask the user questions:
        Scanner s = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = s.nextLine();
        System.out.println(name);
        me.Name = name;
        me.printInfo();
    }
    public void printDeck(){
        for (int y = 0; y<deck.length; y++){
            deck[y].printInfo();
        }
    }


    public void compare() {

    }
    public void round() {

    }
    public void shuffle() {
    for(int z=0; z<deck.length; z++){
        int randomIndex = (int)(Math.random()*52);
        Card spencer = deck[randomIndex];
        deck[randomIndex] = deck[z];
        deck[z]= spencer;
    }
    }

}
