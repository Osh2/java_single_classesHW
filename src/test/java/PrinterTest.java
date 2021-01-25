import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(82);
    }

    @Test
    public void shouldHavePaperLeftProp(){
        assertEquals(82, printer.getSheets());
    }
}
