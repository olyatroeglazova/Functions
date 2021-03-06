package Functions;

import Interfaces.Function;

public class SinFunction  implements Function{
    private double lowerLimit;
    private double upperLimit;
    double A;
    double B;


    public void setLimits(double lowerLimit, double upperLimit){
        if (lowerLimit>upperLimit){
            throw new IllegalArgumentException("Введены неверные границы отрезка!");
        }
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public void setCoefficients(double A, double B){
        if (A==0){
            throw new IllegalArgumentException("Ошибка! Введены неправильные коэффициенты!");
        }
        this.A = A;
        this.B = B;
    }
    public double calculation(double x){
       if(x<lowerLimit||x>upperLimit){
            throw new IllegalArgumentException("Аргумент не пренадлежит отрезку ["+lowerLimit+", "+upperLimit +"]");
        }
        return A*Math.sin(B*x);
    }
    public double getLowerLimit(){
        return lowerLimit;
    }
    public double getUpperLimit(){
        return upperLimit;
    }

}
