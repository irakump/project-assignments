package week3.temperatureconverter;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(7.22, converter.fahrenheitToCelsius(45), 0.01);
        assertEquals(-17.78, converter.fahrenheitToCelsius(0), 0.01);
        assertEquals(-73.33, converter.fahrenheitToCelsius(-100), 0.01);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(113, converter.celsiusToFahrenheit(45));
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(-29.2, converter.celsiusToFahrenheit(-34), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        // Int values
        assertTrue(converter.isExtremeTemperature(-50));
        assertTrue(converter.isExtremeTemperature(-1000));
        assertTrue(converter.isExtremeTemperature(51));
        assertTrue(converter.isExtremeTemperature(112));

        // Double values
        assertTrue(converter.isExtremeTemperature(50.000001));
        assertTrue(converter.isExtremeTemperature(-99.9012940124102));

        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(50));

        assertFalse(converter.isExtremeTemperature(-39.99999999999999999999));
        assertFalse(converter.isExtremeTemperature(20.0001));
    }

}