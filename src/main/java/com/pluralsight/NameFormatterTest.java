package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameFormatterTest {

    @Test
    public void format_fullName_firstAndLastName() {
        String result = NameFormatter.format("Mel Johnson");

        assertEquals("Johnson Mel", result);
    }

    @Test
    public void format_fullName_first_Middle_Last() {
        String result = NameFormatter.format("Mel B Johnson");

        assertEquals("Johnson, Mel B", result);
    }

    @Test
    public void format_fullName_prefix_First_Middle_Last_Suffix() {
        String result = NameFormatter.format("Dr. Mel B Johnson, PhD");

        assertEquals("Johnson, Dr. Mel B, PhD", result);
    }
}
