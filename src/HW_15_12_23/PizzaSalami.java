package HW_15_12_23;

public class PizzaSalami extends Pizza {

    String salami;

    public PizzaSalami(String dough,String mayonnaise,String ketchup,String salami){
        super(dough,mayonnaise,ketchup);
        this.salami = salami;
    }

    public void PrepareSalami(){

        System.out.println("Your order Pizza Salami prepare");
    }

    public void BakeSalami(){
        System.out.println("Your order Pizza Salami bake");
    }


    public void PackageSalami(){
        System.out.println("Your order Pizza Salami package");
    }

}
