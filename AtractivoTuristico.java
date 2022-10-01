
public class AtractivoTuristico{
    private String descripcion;
    private float tiempoEstimado;
    private String caracteristica;
    private float costoEntrada;
    public AtractivoTuristico(String descripcion, float tiempoEstimado){
        this.descripcion = descripcion;
        this.tiempoEstimado = tiempoEstimado;
        caracteristica = null;
    }
    public AtractivoTuristico(String descripcion, float tiempoEstimado, float costoEntrada){
        this.descripcion = descripcion;
        this.tiempoEstimado = tiempoEstimado;
        caracteristica = null;
        this.costoEntrada = costoEntrada;
    }
    public void agregarCaracteristicaSitio(String caracteristica){
        this.caracteristica = caracteristica;
    }
    public float getTiempoEstimado(){
        return tiempoEstimado;
    }
    public float getCostoEntrada(){
        return costoEntrada; 
    }
}
