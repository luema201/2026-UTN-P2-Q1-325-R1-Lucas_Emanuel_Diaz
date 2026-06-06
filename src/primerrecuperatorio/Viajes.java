
package primerrecuperatorio;

import java.util.ArrayList;

public class Viajes{
    private ArrayList<Viaje> viajesList;

    public Viajes(){
            this.viajesList = new ArrayList<>();
    }
    
    public void agregarViaje(Viaje p){
        viajesList.add(p);
    }
    
    public void mostrarViajes(){
        if (viajesList.isEmpty()) {
            System.out.println("No hay viajes registrados.");
            return;
        }
        for (Viaje v : viajesList) {
            System.out.println(v);
        }
    }
    
}
