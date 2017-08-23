package itemscalc;

public class Purchase {

    //method overloading
    public  int PriceCalc(int q, int p)  {              //quantity q and price p are integer values
        return (p * q);
    }

    public  double PriceCalc(double q, int p)  {        //quantity q is decimal values and price p is an integer value
        return (p * q);
    }

    public  double PriceCalc(int q, double p)  {        //quantity q is an integer value and price p is decimal value
        return (p * q);
    }

    public  double PriceCalc(double q, double p)  {    //quantity q and price p are decimal values
        return (p * q);
    }

}

