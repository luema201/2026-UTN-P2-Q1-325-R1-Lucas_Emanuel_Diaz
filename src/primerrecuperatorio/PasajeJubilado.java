
package primerrecuperatorio;


public class PasajeJubilado implements Pasaje{
    @Override
    public void calcularCostoFinal(int costoBase){
        double pasajeJubilado = costoBase / 4;
        System.out.println("==================================");
        System.out.println("Debe pagar: " + pasajeJubilado + " Pesos.");
        System.out.println("==================================");
    }
}
