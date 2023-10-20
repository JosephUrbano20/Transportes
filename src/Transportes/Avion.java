package Transportes;


/**
 *
 * @author Johann Zair Galindo Mayer 
 */
public class Avion extends MediosTransporteAereo{
    /**
     * Atributos de la clase Avion
     */
    private String marca;

    /**
     * Constructor vacio de la clase Avion
     */
    public Avion() {
    }
    
    /**
     * Conatructor lleno de la clase Avion
     *
     */
    public Avion(String marca, int numerodepasajeros, String costo, String combustible, String color, String nombre) {
        super(numerodepasajeros, costo, combustible, color, nombre);
        this.marca = marca;
    }
    
    /**
     * 
     * @return Regresa el nombre de la marca de la Avion
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * 
     * @param marca Asignamos la marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void vuelo(){
     System.out.println("Damas y caballeros les damos la bienvenida al vuelo 333, con destino la Ciudad De Nueva York");
    }
    
}
