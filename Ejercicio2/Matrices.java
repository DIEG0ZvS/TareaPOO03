package Ejercicio2;

import java.sql.SQLOutput;

public class Matrices {
    public Matrices() {
    }
    public static void main(String args[]) {

        int Matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<3;i++){    //numero de filas
            for (int j=0;j<3;j++){     //numero de columnas
                System.out.print("["+Matriz[i][j]+"]");
            }
            System.out.println("");
        }

    }
}
