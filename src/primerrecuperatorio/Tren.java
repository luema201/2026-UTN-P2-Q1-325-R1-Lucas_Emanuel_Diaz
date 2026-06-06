
package primerrecuperatorio;


public class Tren extends VehiculoTransporte{

    public Tren(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }
    
    @Override
    public int calcularCostoBase(int km, int precioNafta){
        //mi calculo del costo base dice que lo que vale el litro de nafta es lo que
       // voy a tomar como precio por cada km que hca un usuario
       int costo = km * precioNafta;
       return costo;
    }
    
    
}
