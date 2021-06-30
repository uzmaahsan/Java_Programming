package day58_polymorphisim;

//public class SuperMan implements worker{
//}
//        ----------
//
//public class A {
//    public void m1(){code}
//}
//
//public interface I {
//    public abstract void m2();
//}
//
//public class B extends A implements I {
//    //m1() is here
//    public void m2() {
//        //code
//    }
//    public void m3() {
//        //code
//    }
//}
//============================
//
//        B b = new B();
//        b.m1(); b.m2(); b.m3();
//
//        A var1 = new B(); Polymorphism.
//        var1.m1();
//        var1.m2(); <-- ERROR
//        var1.m3(); <-- ERROR
//
//        I var2 = new B();
//        var2.m2();
//        var2.m1(); <--ERROR
//        ========================
//
//        add branch / package day58_polymorphism
//
//abstract class OnlineShopping
//-> buy
//        -> sell
//        -> ship
//
//interface Prime
//    -> primeShipping
//
//            Amazon IS-A OnlineShopping impl Prime
//
//interface HandMade
//    makeAndSellFromHome
//
//            Etsy IS-A OnlineShopping impl HandMade
//        }
