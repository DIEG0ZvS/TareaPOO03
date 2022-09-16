package Ejercicio3;

public class SumaDeMatriz {
    public SumaDeMatriz() {
    }
    public static void main(String args[]) {
        int matrizUno[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrizDos[][] = {{5, 3, 2}, {7, 4, 6}, {1, 0, 6}};
        int matrizResultante[][] = new int[3][3];

        //llenado de la primera matriz
        System.out.println("Matriz numero 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrizUno[i][j]+"]");
            }
            System.out.println("");
        }

        //llenado de la segunda matriz
        System.out.println("Matriz numero 2: "); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrizDos[i][j]+"]");
            }
            System.out.println("");
        }

        //Suma de matrices
        System.out.println("Matriz resultante de la suma es: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrizResultante[i][j] = matrizUno[i][j] + matrizDos[i][j];
                System.out.print("["+matrizResultante[i][j]+"]");
            }
            System.out.println("");
        }

        
    }
}
