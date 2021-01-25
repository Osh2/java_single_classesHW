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

    @Test
    public void drinkShouldDecreaseVol(){
        watbot.drink();
        assertEquals(90, watbot.getVolume());
        watbot.drink();
        assertEquals(80, watbot.getVolume());
    }

    @Test
    public void emptyShouldEmptyVol(){
        assertEquals(100, watbot.getVolume());
        watbot.empty();
        assertEquals(0, watbot.getVolume());
    }

    @Test
    public void fillShouldFillVol(){
        assertEquals(100, watbot.getVolume());
        watbot.empty();
        assertEquals(0, watbot.getVolume());
        watbot.fill();
        assertEquals(100, watbot.getVolume());
    }
}
