
public class CarroBasura{
    private int capacidadMaximaRecojo;
    private int totalBasuraRecojida;
    private boolean entregoBasuraBotadero;
    private int cantBasuraEntregadaBotadero;
    private boolean lleno;
    public CarroBasura(int capacidad){
        capacidadMaximaRecojo = capacidad;
        totalBasuraRecojida = 0;
        entregoBasuraBotadero = false;
        cantBasuraEntregadaBotadero = 0;
        lleno = false;
    }

    public String cargarBasura(int cantidad){
        String reporte;
        if(!lleno){
            int total = totalBasuraRecojida + cantidad;
            if(total <  capacidadMaximaRecojo){
                reporte = "Basura recojida "+cantidad;
                totalBasuraRecojida += cantidad;
            }else if(total == capacidadMaximaRecojo){
                reporte = "Basura recojida "+cantidad+", carro lleno";
                totalBasuraRecojida += cantidad;
                lleno = true;
            }else{
                int loMaximoQuePuedeRecojerse = capacidadMaximaRecojo-totalBasuraRecojida;
                reporte = "Basura recojida "+loMaximoQuePuedeRecojerse+", carro lleno";
                totalBasuraRecojida+=loMaximoQuePuedeRecojerse;
                lleno = true;
            }
        }
        else{
            reporte = "Carro lleno";
        }
        return reporte;
    }

    public String entregarBasuraBotadero(boolean estaAbierto){
        String reporte;
        if(estaAbierto){
            entregoBasuraBotadero = true;
            cantBasuraEntregadaBotadero = totalBasuraRecojida;
            totalBasuraRecojida = 0;
            lleno = false;
            reporte = "Se hizo la entrega. Cantidad "+cantBasuraEntregadaBotadero+". Carro vacío";
        }else{
            reporte = "No se hizo la entrega";
        }
        return reporte;
    }

    public int getCantBasuraEntregadaBotadero(){
        return cantBasuraEntregadaBotadero;
    }

    public boolean entregoBasuraBotadero(){
        return entregoBasuraBotadero;
    }

    public int getTotalBasuraRecojida(){
        return totalBasuraRecojida;
    }
}
