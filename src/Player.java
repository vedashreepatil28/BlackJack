

public class Player {
    public int cardTotal;
    public Boolean isBust;
    public Boolean isHit;
    public Card[] hand;
    public String Name;
    public Player(){
        cardTotal = 0;
        isBust = false;
        isHit = false;
        Name = "Me";
        hand = new Card[2];

    }
    public void printInfo(){
        System.out.println("name: " + Name);
        System.out.println("the player has " + cardTotal + " cards.");
        System.out.println("isBust: " + isBust);
        System.out.println("isHit: " + isHit);

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
