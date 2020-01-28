package BID.SWE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /*@Test
    public void SkiAreaPrinter1(){
        SkiAreaePrinter ski = new SkiAreaePrinter();
        String out = ski.PrintSnowState(true, 14.12.2019, 4);
        assertEquals("The snow on the 14.12.2019 is 4 cm high and present", out);
    }*/

    @Test
    public void SkiAreaPrinter2(){
        SkiAreaePrinter ski = new SkiAreaePrinter();
        String out = ski.PrintOpenSlops(6,4);
        assertEquals("From 6 Slopes are 4 open", out);
    }

    @Test
    public void SkiAreaPrinter3(){
        SkiAreaePrinter ski = new SkiAreaePrinter();
        String out = ski.PrintOpenSlops(6,3);
        assertEquals("From 6 Slopes are 3 open", out);
    }

    @Test
    public void SkiAreaPrinter4(){
        SkiAreaePrinter ski = new SkiAreaePrinter();
        String out = ski.PrintOpenSlops(8,9);
        assertEquals("From 8 Slopes are 9 open", out);
    }
}
