
package primerrecuperatorio;

import java.util.ArrayList;


public class Vehiculos {
    private ArrayList<VehiculoTransporte> vehiculos;

    public Vehiculos() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(VehiculoTransporte v){
        vehiculos.add(v);
    }
}
