import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCounterTest {

    @Test
    public void test1(){
        VacationCounter counter = new VacationCounter();
        int months = counter.calculateForVacations(10000, 3000, 20000);
        assertEquals(3, months);
    }

    @Test
    public void test2(){
        VacationCounter counter = new VacationCounter();
        int months = counter.calculateForVacations(100000, 60000, 150000);
        assertEquals(2, months);
    }
}
