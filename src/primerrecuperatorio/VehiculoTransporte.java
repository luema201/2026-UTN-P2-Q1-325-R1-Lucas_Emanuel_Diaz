
package primerrecuperatorio;

public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    public abstract int calcularCostoBase(int km, int precioNafata);
    
    
    
    
    
}
