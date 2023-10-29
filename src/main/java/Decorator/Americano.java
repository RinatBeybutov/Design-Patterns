package Decorator;

public class Americano extends Beverage {

    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
