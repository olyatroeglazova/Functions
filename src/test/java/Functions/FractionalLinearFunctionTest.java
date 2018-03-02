package Functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionalLinearFunctionTest {

    private static final double DELTA = 1e-9;

    @Test
    public void calculation1() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(0.,5.);
        f.setCoefficients(2.,3., 1., 6.);
        double x = 3.;
        double y = 1.;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test
    public void calculation2() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(0.,5.);
        f.setCoefficients(0.,4., 2., 0.);
        double x = 4.;
        double y = 0.5;
        assertEquals(y, f.calculation(x), DELTA);
    }


    @Test(expected = IllegalArgumentException.class)
    public void falseLimits() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(9.,0.);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseCoefficients() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setCoefficients(1.,2.,0., 4.);
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDenominator() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(1.,2.,1., -4.);
        double x = 4.;
        f.calculation(x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xDontBelongLimits() throws Exception {
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(0.,1.);
        f.setCoefficients(2.5,3., 2., 1.1);
        double x = 5.;
        f.calculation(x);
    }
}