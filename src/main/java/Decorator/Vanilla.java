package Decorator;

public class Vanilla extends CondimentDecorator {

    public Vanilla(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Vanilla";
    }
}
