import ge.edu.btu.services.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(4.00, calculatorService.sum(2,2.00), 0);
    }

    @Test
    public void prodTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(4.00, calculatorService.prod(2,2.00), 0);
    }
}
