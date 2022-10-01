import java.util.ArrayList;

public class Paseo{
    ArrayList<AtractivoTuristico> atractivosTuristicos;
    private String nombre;
    public Paseo(String nombre){
        this.nombre = nombre;
        atractivosTuristicos = new ArrayList<AtractivoTuristico>();
    }
    public float duracion(){
        float duracionHrs = 0;
        for(AtractivoTuristico atractivoTuristico : atractivosTuristicos){
            duracionHrs += atractivoTuristico.getTiempoEstimado();
        }
        return duracionHrs;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregar(AtractivoTuristico actractivoTuristico){
        atractivosTuristicos.add(actractivoTuristico);
    }
    public float costo(int cantidadPersonas){
        float costo = 0;
        final int costoGuiaTuristico = 40;
        final int costoXHoraTransporte5Personas = 30;
        float costoTransporte = 0;
        float costoGuia = 0;
        float costoEntradas = costoEntradas(cantidadPersonas);
        costoGuia = costoGuiaTuristico * duracion();
        costoTransporte = (int)(cantidadPersonas/5) * costoXHoraTransporte5Personas * duracion();
        costo = costoGuia + costoTransporte + costoEntradas;
        return costo;
    }
    private float costoEntradas(int cantidadPersonas){
        float costoEntradas = 0;
        for(AtractivoTuristico atractivoTuristico : atractivosTuristicos){
            costoEntradas += atractivoTuristico.getCostoEntrada();
        }
        return costoEntradas * cantidadPersonas;
    }
}
