package Ejercicio1;

import javax.swing.*;

public class MainRaices {

    public static void main(String args[])
    {
        EcuacionRaices raiz = new EcuacionRaices(4/2,6/2,8/2); //constructor

        raiz.setA(10);
        raiz.setB(20);
        raiz.setC(40);

        System.out.println(raiz.getA());
        System.out.println(raiz.getB());
        System.out.println(raiz.getC());
    }
}
