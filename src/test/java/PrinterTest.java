import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(82, 90);
    }

    @Test
    public void shouldHavePaperLeftProp(){
        assertEquals(82, printer.getSheets());
    }

    @Test
    public void shouldHaveToner(){
        assertEquals(90, printer.getToner());
    }

    @Test
    public void shouldPrint_true(){
        printer.print(2, 5);
        assertEquals(72, printer.getSheets());
    }

    @Test
    public void shouldPrint_false(){
        printer.print(20, 15);
        assertEquals(82, printer.getSheets());
    }
}
