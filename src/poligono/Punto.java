package poligono;

public class Punto {

    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + this.x + '\n' + "y = " + this.y + '\n';
    }
}
