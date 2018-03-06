package Functionals;

import Functions.ExpFunction;
import Functions.FractionalLinearFunction;
import Functions.LinearFunction;
import Functions.SinFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralTest {

    private static final double DELTA = 1e-9;


    @Test
    public void IntegralOfLinearFunction() throws Exception {
        Integral I = new Integral(0.,2.);
        LinearFunction f = new LinearFunction();
        f.setLimits(0.,5.);
        f.setCoefficients(5., 2.);
        double y = 14;
        assertEquals(y, I.calculate(f), DELTA);
    }

    @Test
    public void IntegralOfSinFunction() throws Exception {
        Integral I = new Integral(0.,Math.PI);
        SinFunction f = new SinFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(1., 1.);
        double y = 2.;
        assertEquals(y, I.calculate(f), DELTA);
    }

    @Test
    public void IntegralOfFractionalLinearFunction() throws Exception {
        Integral I = new Integral(0.,3);
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(1., 2., 2., 4.);
        double y = 1.5;
        assertEquals(y, I.calculate(f), DELTA);
    }

    @Test
    public void IntegralOfExpFunction() throws Exception {
        Integral I = new Integral(0.,0.1);
        ExpFunction f = new ExpFunction();
        f.setLimits(0.,10.);
        f.setCoefficients(2., 1.);
        double y = 0.310341836;
        assertEquals(y, I.calculate(f), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FalseLimits() throws Exception {
        Integral I = new Integral(0.,2.);
        LinearFunction f = new LinearFunction();
        f.setLimits(0.,1.);
        f.setCoefficients(1.,1.);
        I.calculate(f);
    }


}