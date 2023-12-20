package HW_19_12_23;

public class Tree extends Plant {


    public Tree (String name,String height,int age){
        super(name, height, age);
    }

    @Override
    public void doSpring() {
        System.out.println(getName() + " bloom is Spring");

    }

    @Override
    public void doSummer() {
        System.out.println( getName() + " grow in Summer");

    }

    @Override
    public void doAutumn() {
        System.out.println(getName() + " don't grow in Autumn");
    }

    @Override
    public void doWinter() {
        System.out.println( getName() + " don't grow in Winter");
    }



}
