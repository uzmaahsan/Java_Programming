package day56_abstraction;

import day56_greeting.Tesla;

public class DrivableTest {
    public static <Plane> void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();


    }
}