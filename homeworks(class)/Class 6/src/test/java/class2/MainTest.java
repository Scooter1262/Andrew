package class2;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalInt;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testIsFindMax() {
        Assert.assertEquals(5, Main.findMax(1, 2, 5));

    }

    @Test
    public void testIsFindMin() {
        Assert.assertEquals(1, Main.findMin(1, 2, 5));

    }

    @Test
    public void testIsFindAvg() {
        Assert.assertEquals(2, Main.findAvg(1, 2, 5), 0);

    }

}