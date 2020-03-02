package itclass.skola.homework1;

import org.junit.Assert;

import static org.junit.Assert.*;

public class MyMathTest {

    @org.junit.Test
    public void getMin() {
        MyMath myMath= new MyMath( 1,10);
        int result = myMath.getMin();
        Assert.assertEquals( 1, result);
    }

    @org.junit.Test
    public void getMax() {
        MyMath myMath= new MyMath( 1,10);
        int result = myMath.getMax();
        Assert.assertEquals( 10, result);
    }
}