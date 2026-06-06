
package primerrecuperatorio;


public class Viaje {
    private VehiculoTransporte vehiculo;
    private TipoPasajero tipoPasajero;
    private Pasaje tipoPasaje;
    private double costoFinal;

    public Viaje(VehiculoTransporte vehiculo, TipoPasajero tipoPasajero, Pasaje tipoPasaje, double costoFinal) {
        this.vehiculo = vehiculo;
        this.tipoPasajero = tipoPasajero;
        this.tipoPasaje = tipoPasaje;
        this.costoFinal = costoFinal;
    }

    public VehiculoTransporte getVehiculo() {
        return vehiculo;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public Pasaje getTipoPasaje() {
        return tipoPasaje;
    }

    public double getCostoFinal() {
        return costoFinal;
    }
    
    @Override
    public String toString() {
        return "Vehiculo: " + vehiculo + " | Tipo de pasajero: " + tipoPasajero +
               " | Tipo de pasaje: " + tipoPasaje +
               " | Costo final: " + costoFinal;
    }
}
