package Decorator;

public class Raf extends Beverage {

    public Raf() {
        description = "Raf";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
