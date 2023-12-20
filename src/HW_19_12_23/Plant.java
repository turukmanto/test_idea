package HW_19_12_23;

public abstract class Plant {

    String name;
    String height;
    int age;

    public Plant(String name,String height,int age){
        this.name = name;
        this.height = height;
        this.age = age;

    }
        public String getName(){
           return name;
    }


        public abstract void doSpring();

        public abstract void doSummer();
        public abstract void doAutumn();
        public abstract void doWinter();



    @Override
    public String toString() {
        return name +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", age=" + age
                ;
    }
}
