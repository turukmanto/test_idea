package HW_19_12_23;

public class Flower extends Plant {


    public Flower(String name,String height,int age){
        super(name, height, age);
    }



    @Override
    public void doSpring() {
        System.out.println(getName() + "  grows 30 cm in Spring ");

    }

    @Override
    public void doSummer(){
        System.out.println(getName() + " blooms in Summer ");

    }

    @Override
    public void doAutumn() {
        System.out.println(getName() + " is cut in Autumn");
    }

    @Override
    public void doWinter() {
        System.out.println(getName() + " sleeps in Winter");
    }


}
