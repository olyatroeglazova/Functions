package Functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpFunctionTest {

    private static final double DELTA = 1e-9;

    @Test
    public void calculation() throws Exception {
        ExpFunction f = new ExpFunction();
        f.setLimits(0.,5.);
        f.setCoefficients(1.,2.);
        double x = 0.2;
        double y = 3.2214027582;
        assertEquals(y, f.calculation(x), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseLimits() throws Exception {
        ExpFunction f = new ExpFunction();
        f.setLimits(3.,2.);
    }

    @Test(expected = IllegalArgumentException.class)
    public void falseCoefficients() throws Exception {
        ExpFunction f = new ExpFunction();
        f.setCoefficients(0., 7.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void xDontBelongLimits() throws Exception {
        ExpFunction f = new ExpFunction();
        f.setCoefficients(0., 7.5);
        f.setLimits(1.1,1.2);
        double x = 5.;
        f.calculation(x);
    }


}