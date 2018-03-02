package Functions;

import Interfaces.Function;

public class FractionalLinearFunction implements Function{
    private double lowerLimit;
    private double upperLimit;
    double A;
    double B;
    double C;
    double D;

    public double calculation(double x){
        if(x<lowerLimit||x>upperLimit){
            throw new IllegalArgumentException("Аргумент не пренадлежит отрезку ["+lowerLimit+", "+upperLimit +"]");
        }
        if (C*x+D==0){
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return (A*x+B)/(C*x+D);
    }
    public void setLimits(double lowerLimit, double upperLimit){
        if (lowerLimit>upperLimit){
            throw new IllegalArgumentException("Введены неверные границы отрезка!");
        }
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public void setCoefficients(double A, double B, double C, double D){
        if (C==0){
            throw new IllegalArgumentException("Ошибка! Это линейная функция!");
        }

        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    public double getLowerLimit(){
        return lowerLimit;
    }
    public double getUpperLimit(){
        return upperLimit;
    }

}
