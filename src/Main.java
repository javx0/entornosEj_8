import poligono.Poligono;
import poligono.Punto;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(0,1);
        Punto punto3 = new Punto(1,1);
        Punto punto4 = new Punto(1,0);

        Poligono cuadrado = new Poligono(punto1,punto2,punto3);
        cuadrado.AgregarPunto(punto4);

        Poligono triangulo = new Poligono(punto1,punto2,punto3);

        System.out.println("Triangulo:\n" + triangulo);
        System.out.println("Cuadrado: \n" + cuadrado);
    }
}
