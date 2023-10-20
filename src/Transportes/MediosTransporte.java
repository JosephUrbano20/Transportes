
package Transportes;

/**
 *
 * @author Joseph Gael Urbano Meza
 */
public class MediosTransporte {
    /**
     * Atributos de la clase MediosTransporte
     */
    
 private String costo,combustible,color,nombre;
 
 
/**
 * Constructor vacio de la clase
 */
    public MediosTransporte() {
    }

    /**
     * Constructor lleno de la clase 
     *  
     */
    public MediosTransporte(String costo, String combustible, String color, String nombre) {
        this.costo = costo;
        this.combustible = combustible;
        this.color = color;
        this.nombre = nombre;
    }

    /**
     * 
     * @return el valor del boleto del MediosTransporte
     */
    public String getcosto() {
        return costo;
    }

    /**
     * 
     * @param costo establecemos el valor del boleto
     */
    public void setcosto(String costo) {
        this.costo = costo;
    }

    /**
     * 
     * @return regresa el tipo de combustible 
     */
    public String getcombustible() {
        return combustible;
    }

    /**
     * 
     * @param combustible esteblecemos el tipo de combustible que utiliza el MediosTransporte
     */
    public void setcombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * 
     * @return regresa el color del objeto
     */
    public String getcolor() {
        return color;
    }

    /**
     * 
     * @param color establecemos el color del MediosTransporte
     */
    public void setcolor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return devuelve el nombre de los MediosTransporte
     */
    public String getnombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre establecemos el nombre 
     */
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void iniciaviaje(){
        System.out.println("Inicia su viaje");
    }
    public void finalizaviaje(){
        System.out.println("Finaliza su viaje");
    }

    @Override
    public String toString() {
        return "MedioDeTransporte{" + "costo=" + costo + ", combustible=" + combustible + ", color=" + color + ", nombre=" + nombre + '}';
    }
    
}
