
public class Parque extends AtractivoTuristico{
    private String disponiblePara;
    public Parque(String descripcion, float tiempoEstimado, String disponiblePara){
        super(descripcion, tiempoEstimado);
        this.disponiblePara = disponiblePara;
    }
    public Parque(String descripcion, float tiempoEstimado, String disponiblePara, float costoEntrada){
        super(descripcion, tiempoEstimado, costoEntrada);
        this.disponiblePara = disponiblePara;
    }
}