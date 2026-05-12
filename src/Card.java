public class Card {
    public String suit;
    public int value;
    public String name;

    public Card (String psuit, int pvalue, int pname){
        suit = psuit;
        value = pvalue;
       // name = pname;
        if (pname == 0){
            name = "Ace";
            value = 11;
        }
        if (pname == 1){
            name = "Two";
            value = 2;
        }
        if (pname == 2){
            name = "Three";
            value = 3;
        }
        if (pname == 3){
            name = "Four";
            value = 4;
        }
        if (pname == 4){
            name = "Five";
            value = 5;
        }
        if (pname == 5){
            name = "Six";
            value = 6;
        }
        if (pname == 6){
            name = "Seven";
            value = 7;
        }
        if (pname == 7){
            name = "Eight";
            value = 8;
        }
        if (pname == 8){
            name = "Nine";
            value = 9;
        }
        if (pname == 9){
            name = "Ten";
            value = 10;
        }
        if (pname == 10){
            name = "Jack";
            value = 10;
        }
        if (pname == 11){
            name = "Queen";
            value = 10;
        }
        if (pname == 12){
            name = "King";
            value = 10;
        }

    }

    public void printInfo(){
        System.out.println("The " + name + " of " + suit + " is worth " + value + " points.");
    }
}
