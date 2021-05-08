package day_10shorthand_operators;

public class ShortHandOpertors {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot =" + cars);
        cars = cars +2;
        System.out.println("cars in parking lot =" + cars);
        cars = + 5;
        System.out.println("cars in parking lot =" + cars);
        cars -= 6 ;
        System.out.println("cars in parking lot = " + cars);
        cars = cars - 1 ;
        
        int electricCars = 13;
        System.out.println("electricCars = " + electricCars);
        cars = cars + electricCars;
        System.out.println("cars in parking lot = " + electricCars);
        
        String word = "java";
        System.out.println("word = " + word);
        word = word + "programming";
        System.out.println("word = " + word);
         word += " is fun";
        System.out.println("word = " + word);
        String selenium = " but selenium is more fun .";
        word+= selenium;
        System.out.println("selenium = " + selenium);
        double parkingFee = 10.50;
        System.out.println("normal parkingFee = " + parkingFee);
        //early bird fee is 50 off'
        parkingFee = parkingFee / 2;
        parkingFee /=2;
        System.out.println("early bird parking fee +" + parkingFee);
        parkingFee-= parkingFee;
        System.out.println(" weekend parkingFee = " + parkingFee);

    }
}
