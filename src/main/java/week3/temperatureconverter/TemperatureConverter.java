package week3.temperatureconverter;

public class TemperatureConverter {

    public TemperatureConverter() {
    }

    public double fahrenheitToCelsius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double temperatureCelsius) {
        return temperatureCelsius * 9 / 5 + 32;
    }

    public double kelvinToCelsius(double temperatureKelvin) {
        return temperatureKelvin - 273.15;
    }

    public boolean isExtremeTemperature(double temperatureCelsius) {
        return temperatureCelsius < -40 || temperatureCelsius > 50;
    }

}
