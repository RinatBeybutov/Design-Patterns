package org.example;

import Decorator.*;
import Factory.FactoryMethod.ChicagoPizzaStore;
import Factory.FactoryMethod.NYPizzaStore;
import Factory.SimpleFactory.Pizza;
import Factory.SimpleFactory.PizzaStore;
import Factory.SimpleFactory.SimplePizzaFactory;
import junit.framework.TestCase;
import Observer.CurrentConditionsDisplay;
import Observer.ForecastDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherData;

public class AppTest extends TestCase {

    public void testObserver() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        assertTrue(true);
    }

    public void testDecorator() {
        Beverage espresso = new Espresso();
        System.out.println(String.format("%s $%s",espresso.getDescription(), espresso.cost()));

        Beverage lattePlusMochaAndVanilla = new Latte();
        lattePlusMochaAndVanilla = new Mocha(lattePlusMochaAndVanilla);
        lattePlusMochaAndVanilla = new Vanilla(lattePlusMochaAndVanilla);
        System.out.println(String.format("%s $%s", lattePlusMochaAndVanilla.getDescription(), lattePlusMochaAndVanilla.cost()));

        Beverage americanoPlusDoubleMochaAndVanilla = new Americano();
        americanoPlusDoubleMochaAndVanilla = new Mocha(americanoPlusDoubleMochaAndVanilla);
        americanoPlusDoubleMochaAndVanilla = new Mocha(americanoPlusDoubleMochaAndVanilla);
        americanoPlusDoubleMochaAndVanilla = new Vanilla(americanoPlusDoubleMochaAndVanilla);
        System.out.println(String.format("%s $%s", americanoPlusDoubleMochaAndVanilla.getDescription(), americanoPlusDoubleMochaAndVanilla.cost()));

    }

    public void  testSimpleFactory() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }

    public void testFactoryMethod() {
        Factory.FactoryMethod.PizzaStore nyStore = new NYPizzaStore();
        Factory.FactoryMethod.PizzaStore chicagoStore = new ChicagoPizzaStore();

        Factory.FactoryMethod.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

    public void testAbstractFactory() {
        Factory.AbstractFactory.PizzaStore nyStore = new Factory.AbstractFactory.NYPizzaStore();
        Factory.AbstractFactory.PizzaStore chicagoStore = new Factory.AbstractFactory.ChicagoPizzaStore();

        Factory.AbstractFactory.Pizza.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
