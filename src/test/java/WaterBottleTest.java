import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle watbot;

    @Before
    public void before(){
        watbot = new WaterBottle();
    }

    @Test
    public void volShouldStartAt100(){
        assertEquals(100, watbot.getVolume());
    }
}
