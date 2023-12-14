package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberConverterTest {

    @Test
    public void with_499_should_return_CDXCIX(){

        final String EXPECTED_VALUE = "CDXCIX";

        String actual = RomanNumberConverter.fromArabic(499);

        assertEquals(EXPECTED_VALUE, actual);
    }

}
