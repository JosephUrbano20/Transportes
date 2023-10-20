
package Transportes;

    
public class Automovil extends MediosTransporteTerrestre {
    /**
     * Atributos de la clase Automovil
     */
    private String modelo;

    /**
     * COnstructor vacio de la clase Automovil
     */
    public Automovil() {
        super();
        this.modelo = "Desconocido";
    }
    
    /** 
     *  Constructor personalizado de la clase Automovil 
     */
    public Automovil(String costo, String combustible, String color, String nombre, int numeroRuedas, String modelo) {
        super(costo, combustible, color, nombre, numeroRuedas);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", modelo=" + modelo + '}';
    }
}
