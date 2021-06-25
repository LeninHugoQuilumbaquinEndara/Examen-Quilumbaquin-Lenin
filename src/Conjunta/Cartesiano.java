
package Conjunta;

public class Cartesiano {
    // atributos
    private int x;
    private int y;

    public Cartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
        public void cuadrante() {

        if (this.x > 0 && this.y > 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante (Derecha Arriba)");
        } else if (this.x < 0 && this.y > 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante(Izquierda Arriba)");
        } else if (this.x < 0 && this.y < 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante(Izquierda Abajo)");
        } else if (this.x > 0 && this.y < 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante(Derecha Abajo)");
        }
    }
        public  double dis(Cartesiano punt){
            double cat1=this.x - punt.getX();
            double cat2=this.y - punt.getY();
            double dis=Math.sqrt(cat1*cat1+cat2*cat2);
            return dis;
        }
}
