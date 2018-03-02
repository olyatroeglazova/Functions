package Functionals;

import Interfaces.Function;
import Interfaces.Functional;

public class Sum implements Functional{

    public Sum(){ }
    public double calculate(Function f){

        return f.calculation(f.getLowerLimit())+
                f.calculation(f.getUpperLimit())+
                f.calculation(f.getLowerLimit()+(f.getUpperLimit()-f.getLowerLimit())/2);
    }
}
