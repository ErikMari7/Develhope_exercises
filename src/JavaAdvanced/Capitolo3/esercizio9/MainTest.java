package JavaAdvanced.Capitolo3.esercizio9;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @Test
    void year() {
        String result = testing.year(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("2023",result);
    }

    @Test
    void month() {
        String result = testing.month(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("march",result.toLowerCase());
    }

    @Test
    void day() {
        String result = testing.day(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("1",result);
    }

    @Test
    void dayOfWeek() {
        String result = testing.dayOfWeek(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("wednesday",result.toLowerCase());
    }
}