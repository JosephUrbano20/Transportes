/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Transportes;

/**
 *
 * @author Joseph Gael Urbano Meza
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediosTransporte medioTrans = new MediosTransporte();
        medioTrans.setcolor("Rojo");
        medioTrans.setcombustible("Gasoleo");
        medioTrans.setnombre("Disney Cruise Line");
        medioTrans.setcosto("500 dolares");
        
        MediosTransporte medioAereo = new MediosTransporte();
        medioAereo.setcolor("Blanco con franjas azules");
        medioAereo.setcosto("1000 dolares");
        medioAereo.setcombustible("100 LL o JET A");
        medioAereo.setnombre("Boeing 727 ");
        
    
        System.out.println("-------------------- Transporte Acuatico -------------------\n");
        System.out.println("El nombre del crucero es: "+ medioTrans.getnombre());
        System.out.println("El color del crucero es: "+ medioTrans.getcolor());
        System.out.println("El combustible que ocupa el crucero se denomina como: "+ medioTrans.getcombustible());
        System.out.println("El costo de un boleto para un viaje en crucero es aproximadamente"+ medioTrans.getcosto());
        System.out.println("\n");
        
        System.out.println("-------------------- Transporte Aereo -------------------\n");
        System.out.println("El nombre de la avion es: "+ medioAereo.getnombre());
        System.out.println("El color de la avion es: "+ medioAereo.getcolor());
        System.out.println("El combustible que ocupan las aviones se denomina como: "+ medioAereo.getcombustible());
        System.out.println("El costo de un boleto de avion es aproximadamente de: "+ medioAereo.getcosto());
        System.out.println("\n");

        MediosTransporteTerrestre medioTerrestre = new Automovil("20000 dolares", "Gasolina", "Negro", "Ford", 4, "Mustang");
        System.out.println("-------------------- Transporte Terrestre -------------------\n");
        System.out.println("El nombre del automovil es: " + medioTerrestre.getnombre());
        System.out.println("El modelo del automovil es: " + ((Automovil) medioTerrestre).getModelo());
        System.out.println("El color del automovil es: " + medioTerrestre.getcolor());
        System.out.println("El combustible que ocupa el automovil es: " + medioTerrestre.getcombustible());
        System.out.println("El costo del automovil es: " + medioTerrestre.getcosto());
        System.out.println("El numero de ruedas del automovil es: " + medioTerrestre.getNumeroRuedas());
        System.out.println("\n");

    }
}

