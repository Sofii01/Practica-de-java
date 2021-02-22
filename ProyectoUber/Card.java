package ProyectoUber;

public class Card extends payment{
    Integer number;
    Integer CVV;
    String dateCard;

    public Card (Integer number, Integer CVV, String dateCard){
        this.number= number;
        this.CVV= CVV;
        this.dateCard=dateCard;

    }
    
}
