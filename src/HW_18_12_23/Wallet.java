package HW_18_12_23;

public class Wallet {

    String name;
    String type;
    Money money;

    public Wallet(String name,String type,Money money){
        this.name = name;
        this.type = type;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet { " +
                " name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", money = " + money +
                '}';
    }
}
