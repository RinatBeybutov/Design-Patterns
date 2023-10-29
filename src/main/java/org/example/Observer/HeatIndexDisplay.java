package org.example.Observer;

public class HeatIndexDisplay implements DisplayElement, Observer{
    float heatIndex = 0.0f;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        float temperature = weatherData.getTemperature();
        float humidity = weatherData.getHumidity();
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    private float computeHeatIndex(float t, float h) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * h) - (0.100254 * t * h)
                + (0.00941695 * (t * t)) + (0.00728898 * (h * h))
                + (0.000345372 * (t * t * h)) - (0.000814971 * (t * h * h)) +
                (0.0000102102 * (t * t * h * h)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (h * h * h)) + (0.00000142721 * (t * t * t * h)) +
                (0.000000197483 * (t * h * h * h)) - (0.0000000218429 * (t * t * t * h * h)) +
                0.000000000843296 * (t * t * h * h * h)) -
                (0.0000000000481975 * (t * t * t * h * h * h)));
        return index;
    }

    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
