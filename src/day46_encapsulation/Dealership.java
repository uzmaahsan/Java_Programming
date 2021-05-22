package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR below, model and year are PRIVATE and cannot be accessed from a different class
        //car1.model = "Nissan Altima";
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //automatically calls toString method
        Car alphaRomeo = new Car();
        alphaRomeo.setModel("alpha Romeo");
        alphaRomeo.setYear(2017);
        alphaRomeo.setMileage(16604);
        System.out.println("Model = " + alphaRomeo.getModel());
        System.out.println("year = " + alphaRomeo.getYear());
        System.out.println("Millage = " + alphaRomeo.getMileage());
        System.out.println(alphaRomeo);


    }
}



