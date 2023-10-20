
package Transportes;

public class MediosTransporteTerrestre extends MediosTransporte {
    /**
     * Atributos de la clase MediosTransporteTerrestre
     */
    private int numeroRuedas;
    
    /**
     * Constructor vacio 
     */
    public MediosTransporteTerrestre() {
        super();
        this.numeroRuedas = 4; // Default value
    }

    /**
     * Constructor personalizado de la clase MediosTransporteTerrestre
     *
     */
    public MediosTransporteTerrestre(String costo, String combustible, String color, String nombre, int numeroRuedas) {
        super(costo, combustible, color, nombre);
        this.numeroRuedas = numeroRuedas;
    }

    /**
     * 
     * @return regresa el numero de llantas 
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * 
     * @param numeroRuedas asignamos el numero de ruedas
     */
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroRuedas=" + numeroRuedas + '}';
    }
}
