package poligono;

import java.util.ArrayList;

public class Poligono {
    private ArrayList<Punto> listaPuntos;

    public Poligono(Punto punto1, Punto punto2, Punto punto3) {
        listaPuntos = new ArrayList<>();
        listaPuntos.add(punto1);
        listaPuntos.add(punto2);
        listaPuntos.add(punto3);
    }

    public void AgregarPunto(Punto puntoAgregar){
        listaPuntos.add(puntoAgregar);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < listaPuntos.size(); i++) {
            resultado = resultado + "Punto " + i + ":\n" + listaPuntos.get(i);
        }
        return resultado;
    }
}
