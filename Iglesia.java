
/**
 * Write a description of class Iglesia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iglesia extends AtractivoTuristico{
    private int anioConstruccion;
    public Iglesia(String descripcion, float tiempoEstimado, int anioConstruccion){
        super(descripcion, tiempoEstimado);
        this.anioConstruccion = anioConstruccion;
    }
    
}