package HW_15_12_23;

public class PizzaMargarita extends Pizza {

    String mozzarella;
    String tomato;

    public PizzaMargarita( String dough, String mayonnaise, String ketchup,String mozzarella, String tomato) {
        super(dough, mayonnaise, ketchup);
        this.mozzarella = mozzarella;
        this.tomato = tomato;
    }
    public void PrepareMargarita(){

        System.out.println("Your order Pizza Margarita prepare");
    }

    public void BakeMargarita(){
        System.out.println("Your order Pizza Margarita bake");
    }


    public void PackageMargarita(){
        System.out.println("Your order Pizza Margarita package");
    }




}
