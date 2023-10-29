package org.example;

import Decorator.*;
import jdk.jfr.Name;
import junit.framework.TestCase;
import org.example.Observer.CurrentConditionsDisplay;
import org.example.Observer.ForecastDisplay;
import org.example.Observer.StatisticsDisplay;
import org.example.Observer.WeatherData;

/**
 * Unit test for simple App.
 */
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
}
