
package Conjunta;

import java.util.Scanner;

public class Generar {
        static Scanner datos = new Scanner(System.in);
        public static void main(String[] args) {
            double dist;
        // creamos un array 
        System.out.println("Cuántas posiciones quiere dsiponer");
        int n = datos.nextInt();
        Cartesiano[] puntos = new Cartesiano[n];
        // rellenamos el array con números aleatorios en x e y.
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Cartesiano(Generar.aleatorio(100),Generar.aleatorio(100));
        }
        // recorremos el array e imprimimos x e y
        for (Cartesiano punto : puntos) {
            System.out.println("Punto x en la coordenada: " + punto.getX());
            System.out.println("Punto y en la coordenada: " + punto.getY());
            punto.cuadrante();
            dist= dis(puntos);
            System.out.println("La distancia es : "+dist);
        }
    }
    public static int aleatorio(int numero) {
        int c = (int) (Math.random() * numero);
        if (c < 50) {
            c = -c;
        }
        return c;
    }
    public static double dis(Cartesiano pun[]){
        int aux=0;
        double dis=0;
        for (int i = 0; i <pun.length; i++) {
            aux=aux+1; 
            if (aux==2){
            dis=Math.sqrt(pun[i-1].getX()*pun[i].getX()+pun[i-1].getY()*pun[i].getY());
        }     
       }
        return dis;
    }
}
