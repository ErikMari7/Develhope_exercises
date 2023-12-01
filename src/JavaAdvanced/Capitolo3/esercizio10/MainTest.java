package JavaAdvanced.Capitolo3.esercizio10;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @Test
    void finalData() {
        String result = testing.finalData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("08 febbraio 2024",result.toLowerCase());
    }
}