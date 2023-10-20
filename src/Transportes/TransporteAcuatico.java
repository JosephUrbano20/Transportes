
package Transportes;

/**
 *
 * @author Joseph Gael Urbano Meza 
 */
public class TransporteAcuatico extends MediosTransporte {
    /**
     * Atributos de la clase MediosTransporteAcuatico
     */
    int velocidadMax;
    int peso;

    /**
     * Constructor vacio de la clase
     */
    public TransporteAcuatico() {
    }

    /**
     *Constructor lleno de la clase MediosTransporteAcuatico 
     *
     */
    public TransporteAcuatico(int velocidadMax, int peso, String costo, 
            String combustible, String color, String nombre) {
        super(costo, combustible, color, nombre);
        this.velocidadMax = velocidadMax;
        this.peso = peso;
    }

    /**
     * 
     * @return la velocidad maxima del MediosTransporteAcuatico
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * 
     * @param velocidadMax establecemos el valor de la velocidad maxima
     */
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * 
     * @return regresa el peso del MediosTransporteAcuatico
     */
    public int getPeso() {
        return peso;
    }
  
    /**
     * 
     * @param peso se define el peso de MediosTransporteAcuatico
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

   
    @Override
    public String toString() {
        return "TransporteAcuatico{" + "velocidadMax=" + velocidadMax + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
