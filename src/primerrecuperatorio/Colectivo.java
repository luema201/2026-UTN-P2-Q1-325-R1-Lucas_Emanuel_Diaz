package primerrecuperatorio;

public class Colectivo extends VehiculoTransporte{

    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }
    
    @Override
    public int calcularCostoBase(int km, int precioNafta){
       //mi calculo del costo base dice que el cuadruple lo que vale el litro de nafta es lo que
       // voy a tomar como precio por cada km que hca un usuario
       int costo = km * (precioNafta * 4);
       return costo;
       
       
               
    }
}
