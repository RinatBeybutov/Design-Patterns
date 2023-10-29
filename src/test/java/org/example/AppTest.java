package org.example;

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
}
