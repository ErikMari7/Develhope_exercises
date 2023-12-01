package JavaAdvanced.Capitolo3.esercizio7;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @Test
    void fullData() {
        String result = testing.fullData(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002", result);
    }

    @Test
    void mediumData() {
        String result = testing.mediumData(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002", result);
    }

    @Test
    void shortData() {
        String result = testing.shortData(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02", result);
    }
}