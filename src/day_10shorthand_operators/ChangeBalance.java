package day_10shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after kenafa =" + balance);
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance-plov;
        System.out.println("balance after plov = " + balance);
        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);
        //buy 4 iced teas and decrease balance
        balance = balance - iceTea  * 4 ;
        System.out.println("balance after 4 iceTea = " + balance);
        //return baklava
        System.out.println("returning baklava =" + baklava );
        balance = balance + baklava;
        System.out.println("balance after returing baklava = $ " + balance);

    }

}


