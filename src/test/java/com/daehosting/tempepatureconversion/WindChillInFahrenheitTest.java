package com.daehosting.tempepatureconversion;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WindChillInFahrenheitTest {

    @Test
    void windChillinFarenheit() {
        TemperatureConversionsSoapType temperatureConversions = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = temperatureConversions.windChillInFahrenheit(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(3.17800013);
        assertEquals(actual, expected);
    }

    @Test
    void windChillinCelsius() {
        TemperatureConversionsSoapType temperatureConversions = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal actual = temperatureConversions.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(1.41);
        assertEquals(actual, expected);
    }
}