package HomeWork_04_12_23;

public class GruppaStudents {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Peter";
        student1.ege = 20;

        System.out.println(student1.name + " have age is " + student1.ege + " years");

        Student student2 = new Student();

        student2.name = "Greg";
        student2.ege = 22;

        System.out.println(student2.name + " have age is " + student2.ege + " years");

        Student student3 = new Student();

        student3.name = "Mary";
        student3.ege = 19;

        System.out.println(student3.name + " have age is " + student3.ege + " years");

    }
}
