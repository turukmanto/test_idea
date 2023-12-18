package HW_18_12_23;

public class Money {

    String name;
    String view;
    int paper;
    int coins;


    public Money(String name,String view,int paper,int coins){
        this.name = name;
        this.view = view;
        this.paper = paper;
        this.coins = coins;
    }

    @Override
    public String toString() {
        return "Money { " +
                "name = '" + name + '\'' +
                ", view = '" + view + '\'' +
                ", paper = " + paper +
                ", coins = " + coins +
                '}';
    }
}
