package Ejercicio1;

public class EcuacionRaices {

    double a;
    double b;
    double c;

    public EcuacionRaices(double numA, double numB, double numC) {
        a = numA;
        b = numB;
        c = numC;
    }


    public void setA(double numA)
    {
        a = numA;
    }

    public double getA()
    {
        return a;
    }

    public void setB(double numB)
    {
        b = numB;
    }

    public double getB()
    {
        return b;
    }

    public void setC(double numC)
    {
        c = numC;
    }
    public double getC()
    {
        return c;
    }

    public double discrimiante()
    {
        double expresion;

        expresion = Math.pow(getB(),2)-(4*getA()*getC());

        return expresion;
    }

    public double solucion()
    {
        double respuestaI;

        if (discrimiante() > 0)
        {
            System.out.println("2 soluciones");
            double respuestaII;

            respuestaI=(-getB()+Math.sqrt(discrimiante()))/(2*getA());
            respuestaII=(-getB()-Math.sqrt(discrimiante()))/(2*getA());

            System.out.println("X = "+respuestaI);
            System.out.println("X = "+respuestaII);
        }
        else if (discrimiante() <= 0)
        {
            System.out.println("Ninguna solucion");
        }
        return 0;
    }
}
