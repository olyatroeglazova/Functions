package Functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinFunctionTest {

    private static final double DELTA = 1e-9;


    @Test
    public void calculation1() throws Exception {
        SinFunction f = new SinFunction();
        f.setLimits(0.1,2.);
        f.setCoefficients(1.,1.);
        double x = Math.PI/6;
        double y = 0.5;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test
    public void calculation2() throws Exception {
        SinFunction f = new SinFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(1.,1.);
        double x = Math.PI;
        double y = 1.22e-16;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xDontBelongLimits() throws Exception {
        SinFunction f = new SinFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(1.,1.);
        double x = 20.;
        f.calculation(x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseCoefficients() throws Exception {
        SinFunction f = new SinFunction();
        f.setCoefficients(0.,1.);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseLimits() throws Exception {
        SinFunction f = new SinFunction();
        f.setLimits(10.,0.);
    }

}