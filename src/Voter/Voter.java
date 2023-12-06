package Voter;

public class Voter {

    //Создать класс Избиратель ( Voter) , содержащий данные избирателя ( имя, возраст, адрес)
    // а также конструктор, геттеры и сеттеры.
    //При создании экземпляра класса должно быть учтено, что минимальный возраст для участия в выборах в Германии 16 лет
    //Создать несколько обьектов этого класса и вывести на печать

    private String name;
    private int age;
    private String address;

    public Voter(String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 16) {
            this.age = age;
        }
        else {
            System.out.println("small");
        }

    }
        public void setAddress (String address){
            this.address = address;
        }

        public String toString(){

        return "Age :" + getAge() + "\nname :" + getName() + " \naddress :" + getAddress();
        }
    }

