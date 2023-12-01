package JavaAdvanced.Capitolo3.esercizio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @Test
    void divisione_tra_due_numeri() {
        Integer result = testing.division(4,2);
        assertEquals(2,result, "La divisione 4 / 2 dovrebbe fare 2");
    }
}