package HW_18_12_23;

public class main {

    //С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
    //Вывести на печать несколько обьектов класса Wallet

    public static void main(String[] args) {

        Money money = new Money("Dollar","paper",100,50);
        Wallet wallet1 = new Wallet("USA","paper",money);

        System.out.println( " 1 : " + wallet1);

        Money money1 = new Money("Euro","paper",200,100);
        Wallet wallet2 = new Wallet("DE","paper",money1);

        System.out.println(" 2 : " + wallet2);

        Money money2 = new Money("Coins","el", 0 ,0);
        Wallet wallet3 = new Wallet("DE","el",money2);

        System.out.println(" 3 : " + wallet3);




    }

}
