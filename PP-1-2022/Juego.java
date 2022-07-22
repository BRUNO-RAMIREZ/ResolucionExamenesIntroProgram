
public class Juego{
    private int numeroObjetivo;
    private int acumulado;
    private boolean enJuego;
    public Juego(){
        numeroObjetivo = (int)(Math.random() * 50) + 10;
        acumulado = 0;
        enJuego = true;
    }
    public String jugar(int incremento){
        String reporte ="";
        if(enJuego == true){
            acumulado += incremento;
            if(acumulado == numeroObjetivo){
                reporte = reporte + "Jugador Humano:"+"   incrementa " + incremento + "   El jugador Humano ha ganado! Juego terminado!\n";
                enJuego = false;
            }else if(acumulado > numeroObjetivo){
                reporte = reporte + "Jugador Humano:"+"   incrementa " + incremento + "   El jugador Humano ha empatado! Juego terminado!\n";
                enJuego = false;
            }else{
                reporte = reporte + "Jugador Humano:"+"   incrementa " + incremento + "   El numero acumulado es " + acumulado + "\n";
                int incrementoComputadora = generarJugada();
                acumulado += incrementoComputadora;
                if(acumulado == numeroObjetivo){
                    reporte = reporte + "Jugador Computadora:"+"   incrementa " + incrementoComputadora + "   El jugador Computadora ha ganado! Juego terminado!\n";
                    enJuego = false;
                }else if(acumulado > numeroObjetivo){
                    reporte = reporte + "Jugador Computadora:"+"   incrementa " + incrementoComputadora + "   El jugador Computadora ha empatado! Juego terminado!\n"; 
                    enJuego = false;
                }else{
                    reporte = reporte + "Jugador Computadora:"+"   incrementa " + incrementoComputadora + "   El numero acumulado es " + acumulado + "\n";
                }
                
            }
        }      
        return reporte;
    }
    private int generarJugada(){
        int jugada = 1;
        int diferencia = numeroObjetivo - acumulado;
        if( diferencia <= 4){
            jugada = diferencia;
        }else if(diferencia == 6){
            jugada = 1;
        }else if(diferencia == 7){
            jugada = 2;
        }else if(diferencia == 8){
            jugada = 3;
        }else if(diferencia == 9){
            jugada = 4;
        }
        return jugada;
    }
}
