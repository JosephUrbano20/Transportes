
package Transportes;

/**
 *
 * @author Joseph Gael Urbano Meza
 */
public class Crucero extends TransporteAcuatico {
    int capacidadCarga;
    float autonomia;

    public Crucero() {
    }

    public Crucero(int capacidadCarga, float autonomia, int velocidadMax, 
            int peso, String costo, String combustible, 
            String color, String nombre) {
        super(velocidadMax, peso, costo, combustible, color, nombre);
        this.capacidadCarga = capacidadCarga;
        this.autonomia = autonomia;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Crucero{" + "capacidadCarga=" + capacidadCarga + ", autonomia=" + autonomia + '}';
    }
    
    
    
    
    
}
