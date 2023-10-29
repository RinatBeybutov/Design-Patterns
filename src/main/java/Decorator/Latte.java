package Decorator;

public class Latte extends Beverage {

    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
