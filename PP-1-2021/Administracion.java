
public class Administracion{
    private int cantBasuraEntregada;
    private int cantBasuraNoEntregada;
    public Administracion(){
        cantBasuraEntregada = 0;
        cantBasuraNoEntregada = 0;
    }
    public void registrarDatosCarro(CarroBasura carroBasura){
        if(carroBasura.entregoBasuraBotadero()){
            cantBasuraEntregada += carroBasura.getCantBasuraEntregadaBotadero();
        }else{
            cantBasuraNoEntregada += carroBasura.getTotalBasuraRecojida();
        }
    }
    public int basuraEnCirculacion(){
        return cantBasuraNoEntregada;
    }
}
