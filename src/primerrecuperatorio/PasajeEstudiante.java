
package primerrecuperatorio;

public class PasajeEstudiante implements Pasaje{
    @Override
    public void calcularCostoFinal(int costoBase){
        double pasajeEstudiante = costoBase /2;
        System.out.println("==================================");
        System.out.println("Debe pagar: " + pasajeEstudiante + " Pesos.");
        System.out.println("==================================");
    }
}
