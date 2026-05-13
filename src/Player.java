

public class Player {
    public int cardTotal;
    public Boolean isBust;
    public Boolean isHit;
    public Card[] hand;
    public String Name;
    public Player(){
        cardTotal = 2;
        isBust = false;
        isHit = false;
        Name = "Me";
        printPlayer();
    }
    public void printPlayer(){
        System.out.println("the player has " + cardTotal + " cards. It is " +  isBust + " that the hand is bust. It is " + isHit + " the player hit. The player is named "+ Name);
    }


    public void hit() {

    }
    public void stand() {

    }

}
