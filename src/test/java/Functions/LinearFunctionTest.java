package Functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearFunctionTest {

    private static final double DELTA = 1e-9;

    @Test
    public void calculation1() throws Exception {
        LinearFunction f = new LinearFunction();
        f.setLimits(1., 4.5);
        f.setCoefficients(2.,4.);
        double x = 2.5;
        double y = 9;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test
    public void calculation2() throws Exception {
        LinearFunction f = new LinearFunction();
        f.setLimits(-10., -3.);
        f.setCoefficients(0,7.);
        double x = -3.5;
        double y = 7;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseLimits() throws Exception {
        LinearFunction f = new LinearFunction();
        f.setLimits(2.5,0.);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xDontBelongLimits() throws Exception {
        LinearFunction f = new LinearFunction();
        f.setLimits(0.,1.);
        f.setCoefficients(2.5,3.);
        double x = 5.;
        f.calculation(x);
    }


}