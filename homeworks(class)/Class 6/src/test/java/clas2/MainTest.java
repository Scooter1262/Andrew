package clas2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testIsEven_isEven() {
        Assert.assertTrue(Main.isEven(2));
    }

    @Test
    public void testIsEven_isNotEven() {
        Assert.assertFalse(Main.isEven(1));
    }

}