package Main;

import Objetos.Marte;
import Objetos.Tierra;

public class Ejecutar {
    public static void main(String[] args) {
        Tierra tierra = new Tierra("TIERRA", 1, 0.0, 0.0, 0, 0, null, true, 0.0,
                null);
        tierra.masa();
        tierra.volumen();
        tierra.diametro();
        tierra.distancia();
        tierra.tipo();
        tierra.densidad();
        tierra.exterior();
        System.out.println(tierra.toString());
        
        Marte marte = new Marte("MARTE", 2, 0.0, 0.0, 0, 0, null, true, 0.0,
                null);
        marte.masa();
        marte.volumen();
        marte.diametro();
        marte.distancia();
        marte.tipo();
        marte.densidad();
        marte.exterior();
        System.out.println(marte.toString());
        
    }
}
