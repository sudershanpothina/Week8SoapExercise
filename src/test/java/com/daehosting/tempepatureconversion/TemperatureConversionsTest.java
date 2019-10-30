package com.daehosting.tempepatureconversion;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType temperatureConversions = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = temperatureConversions.celsiusToFahrenheit(BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(32);
        assertEquals(expected, actual);
    }
    @Test
    void celsiousToFarenheit() {
        TemperatureConversionsSoapType temperatureConversions = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = temperatureConversions.fahrenheitToCelsius(BigDecimal.valueOf(32));
        BigDecimal expected = BigDecimal.valueOf(0);
        assertEquals(expected, actual);
    }
}