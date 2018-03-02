package Functionals;

import Functions.ExpFunction;
import Functions.FractionalLinearFunction;
import Functions.LinearFunction;
import Functions.SinFunction;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    private static final double DELTA = 1e-9;

    @Test
    public void calculateLinearFunction() throws Exception {
        Sum sum = new Sum();
        LinearFunction f = new LinearFunction();
        f.setLimits(0., 5.);
        f.setCoefficients(4., 5.);
        double y =45.;
        assertEquals(y, sum.calculate(f), DELTA);
    }


    @Test
    public void calculateSinFunction() throws Exception {
        Sum sum = new Sum();
        SinFunction f = new SinFunction();
        f.setLimits(0., Math.PI);
        f.setCoefficients(1., 2.);
        double y =0.;
        assertEquals(y, sum.calculate(f), DELTA);
    }

    @Test
    public void calculateFractionalLinearFunction() throws Exception {
        Sum sum = new Sum();
        FractionalLinearFunction f = new FractionalLinearFunction();
        f.setLimits(5.,10.);
        f.setCoefficients(2., 1., 20.,10.);
        double y =0.3;
        assertEquals(y, sum.calculate(f), DELTA);
    }

    @Test
    public void calculateExpFunction() throws Exception {
        Sum sum = new Sum();
        ExpFunction f = new ExpFunction();
        f.setLimits(0.,0.2);
        f.setCoefficients(1.,0.);
        double y =3.326573676;
        assertEquals(y, sum.calculate(f), DELTA);
    }
}