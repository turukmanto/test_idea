package HW_15_12_23;

public class PizzaHawaii extends Pizza{

    String pineapple;
    String chicken;

    public PizzaHawaii(String dough, String mayonnaise, String ketchup,String pineapple,String chicken){
        super(dough, mayonnaise, ketchup);
        this.pineapple = pineapple;
        this.chicken = chicken;

    }
    public void PrepareHawaii(){

        System.out.println("Your order Pizza Hawaii prepare");
    }

    public void BakeHawaii(){
        System.out.println("Your order Pizza Hawaii bake");
    }


    public void PackageHawaii(){
        System.out.println("Your order Pizza Hawaii package");
    }




}
