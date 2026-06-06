
package primerrecuperatorio;

public class pasajeComun implements Pasaje{
    @Override
    public void calcularCostoFinal(int costoBase){
        System.out.println("==================================");
        System.out.println("Debe pagar: " + costoBase + " pesos.");
        System.out.println("==================================");
    }
}
