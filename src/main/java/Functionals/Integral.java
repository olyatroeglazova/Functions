package Functionals;

import Interfaces.Function;
import Interfaces.Functional;

public class Integral implements Functional {

    private double a;
    private double b;
    private static final int N = 1<<20;

    public Integral( double a, double b){
        this.a = a;
        this.b = b;
    }

    public double calculate(Function f) {
        if(a<f.getLowerLimit()||b>f.getUpperLimit()){
            throw new IllegalArgumentException("Область определения функции не содержится в [a; b]");
        }
        double sum = 0, h = (b - a) / N;
        for (double x = a + h/2; x < b; x += h)
            sum += f.calculation(x) * h;
        return sum;
    }
}
