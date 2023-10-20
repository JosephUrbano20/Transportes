package Transportes;

/**
 *
 * @author Johann Zair Galindo Mayer
 */
public class MediosTransporteAereo extends MediosTransporte{
    /**
     * Atributos asignados a la clase MediosTransporteAereo
     */
    private int numerodepasajeros;

    /**
     * Constructo vacio de la clase
     */
    public MediosTransporteAereo() {
    }

    /**
     * Constructor personalizado de la clase 
     * 
     */
    public MediosTransporteAereo(int numerodepasajeros, String costo, String combustible, String color, String nombre) {
        super(costo, combustible, color, nombre);
        this.numerodepasajeros = numerodepasajeros;
    }

    /**
     * 
     * @return el numero de pasajeros 
     */
    public int getNumerodepasajeros() {
        return numerodepasajeros;
    }

    /** 
     * 
     * @param numerodepasajeros 
     */
    public void setNumerodepasajeros(int numerodepasajeros) {
        this.numerodepasajeros = numerodepasajeros;
    }
    
    /**
     * Metodos de la clase
     * Funcion que permite despegar al MediosTransporteAereo
     */
    public void despega(){
        System.out.println("Tripulacion, abrochense sus cinturones que vamos a despegar");
    }
    
    /**
     * Funcion que permite aterrizar al MediosTransporteAereo
     */
    public void aterriza(){
        System.out.println("Abrochense sus cinturones que vamos a aterrizar");
    }

    @Override
    public String toString() {
        return "MediosTransporteAereo{" + "numerodepasajeros=" + numerodepasajeros + '}';
    }

  
}