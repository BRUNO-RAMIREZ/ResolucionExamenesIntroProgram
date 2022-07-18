
public class Ejercicio3{
    private int costoEntrada;
    public Ejercicio3(int costo){
        costoEntrada = costo;
    }
    public double calcularPago(int cantEntradas){
        double pago = 0.0;
        switch(cantEntradas){
            case 1: pago = costoEntrada; break;
            case 2: pago = costoEntrada - (costoEntrada*0.10); break;
            case 3: pago = costoEntrada - (costoEntrada*0.15); break;
            case 4: pago = costoEntrada - (costoEntrada*0.20); break;
        }
        return pago;
    }
}
