package Objetos;

public class Marte {
    //Atributos
    private String nombre;
    private Integer satelite;
    private Double masa;
    private Double volumen;
    private Integer diametro;
    private Integer distancia;
    private Tipo tipo;
    private Boolean visible;
    private Double densidad;
    private Boolean exterior;
    
    public enum Tipo {
        GASEOSO, TERRESTRE, ENANO
    }
            
    //Metodos
    public void masa(){
        //masa = g*radio^2/cG
        masa = (3.71 * Math.pow(3389000, 2)) / 6.674;
    }
   
    public void volumen(){
        //volumen = (4/3)*pi*radio^3
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(3389000, 3);
    }
    
    public void diametro(){
        //diametro = 2*r 
        diametro = (2 * 3389000) / 1000;
    }
    
    public void distancia(){
        //distancia(km) = distancia(UA)*149600000  
        distancia = (int)(1.52 * 149600000);
    }
    
    public void tipo(){
        if (diametro > 50000) {
            tipo = Tipo.GASEOSO;
        } else if (diametro >= 5000 && diametro <= 50000) {
            tipo = Tipo.TERRESTRE;
        } else {
            tipo = Tipo.ENANO;
        }
    }
   
    public void densidad(){
        //densidad = m/v
        densidad = masa / volumen;
    }
    
    public void exterior(){
        if (distancia > Math.pow(149600000, 2)) {
            exterior = true;
        } else {
            exterior = false;
        }
    }
    
    //Construtor
    public Marte(String nombre, Integer satelite, Double masa, Double volumen,
            Integer diametro, Integer distancia, Tipo tipo, Boolean visible,
            Double densidad, Boolean exterior) {
        this.nombre = nombre;
        this.satelite = satelite;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.tipo = tipo;
        this.visible = visible;
        this.densidad = densidad;
        this.exterior = exterior;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------[Planetas]---------\n");
        sb.append("Nombre del planeta = ").append(nombre);
        sb.append("\nCantidad del satelites = ").append(satelite);
        sb.append("\nMasa del planeta = ").append(masa).append(" Kg");
        sb.append("\nVolúmen del planeta = ").append(volumen).append(" Km^3");
        sb.append("\nDiametro del planeta = ").append(diametro).append(" km");
        sb.append("\nDistancia al sol = ").append(distancia).append(" Km");
        sb.append("\nTipo de planeta = ").append(tipo);
        sb.append("\nEs observable = ").append(visible);
        sb.append("\nDensidad del planeta = ").append(densidad).append(" Cm^3");
        sb.append("\nEs planeta exterior = ").append(exterior);
        sb.append("\n----------------------------");
        return sb.toString();
    }    
}
