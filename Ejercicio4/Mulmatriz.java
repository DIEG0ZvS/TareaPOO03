package Ejercicio4;

import java.util.Scanner;

public class Mulmatriz {

        //Usuario ingresando numero a la matriz

        int fila;
        int columna;

        public Mulmatriz(int Nfila, int Ncolumna) {
            fila = Nfila;
            columna = Ncolumna;
        }
        public void setFila(int Nfila) {
        fila = Nfila;
        }
        public int getFila() {
            return fila;
        }
        public void setColumna(int Ncolumna) {
        columna = Ncolumna;
         }

        public int getColumna() {
            return columna;
        }



        public static void main(String[] args) {
            Mulmatriz matriz1 = new Mulmatriz(2,3);
            int[][] datos1 = new int[matriz1.getFila()][matriz1.getColumna()];

            Mulmatriz matriz2 = new Mulmatriz(3,2);
            int[][] datos2 = new int[matriz2.getFila()][matriz2.getColumna()];

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresar datos del primer matriz");
            for (int i = 0; i < matriz1.getFila(); i++) {
                for (int j = 0; j < matriz1.getColumna(); j++) {
                    System.out.println("Ingrese el indice[" + i + "][" + j + "]: ");
                    datos1[i][j] = scanner.nextInt();
                }
            }

            // muestra la matriz
            System.out.println("Mostrando el primer matriz");
            for (int x = 0; x < matriz1.getFila(); x++) {
                for (int y = 0; y < matriz1.getColumna(); y++) {
                    System.out.print(datos1[x][y] + "\t");;
                }
                System.out.println("");
            }


            System.out.println("Ingresar datos del segundo matriz");
            for (int i = 0; i < matriz2.getFila(); i++) {
                for (int j = 0; j < matriz2.getColumna(); j++) {
                    System.out.println("Ingrese el indice[" + i + "][" + j + "]: ");
                    datos2[i][j] = scanner.nextInt();
                }
            }

            // muestra de matriz
            System.out.println("Mostrando el segundo matriz");
            for (int x = 0; x < matriz2.getFila(); x++) {
                for (int y = 0; y < matriz2.getColumna(); y++) {
                    System.out.print(datos2[x][y] + "\t");;
                }
                System.out.println("");
            }

            if (matriz1.getColumna() == matriz2.getFila()) {
                int[][] resultado = new int[matriz1.getFila()][matriz2.getColumna()];
                for (int x = 0; x < matriz1.getFila(); x++) {
                    for (int y = 0; y < matriz2.getColumna(); y++) {
                        for (int z = 0; z < matriz1.getColumna(); z++) {
                            resultado[x][y] += datos1[x][z] * datos2[z][y];
                        }
                    }
                }

                System.out.println("El resultado de la multiplicacion es: ");
                for (int x = 0; x < matriz1.getFila(); x++) {
                    for (int y = 0; y < matriz2.getColumna(); y++) {
                        System.out.print(resultado[x][y] + "\t");;
                    }
                    System.out.println("");
                }

            }else{
                System.out.println("No se puede multiplicar estas matrizes");
            }
        }
    }