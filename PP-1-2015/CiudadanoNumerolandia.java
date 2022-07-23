
public class CiudadanoNumerolandia{
    private int cantVecesAumentoPeso;
    private int cantVecesRebajoPeso;
    private int menorPeso;
    private int valor;
    public CiudadanoNumerolandia(int valor){
        this.valor = valor;
        menorPeso = getPesoCiudadano(valor);
        cantVecesAumentoPeso = 0;
        cantVecesRebajoPeso = 0;
    }
    public void hacerEjercicio(int nivelEjercicio){
        int numero = valor;
        int base10 = 1;
        int nuevoNumero = 0;
        boolean par = true;
        int acarreo = 0;
        while(numero > 0){
            int ultDig = numero % 10;
            if(par){
                ultDig = ultDig / nivelEjercicio;
                if(acarreo != 0){
                    ultDig += acarreo;
                    acarreo = 0;
                }
                par = false;
            }else{
                ultDig = ultDig * nivelEjercicio;
                if(ultDig > 9){
                    acarreo = (ultDig / 10) % 10;
                    ultDig = ultDig % 10;
                }
                par = true;
            }
            nuevoNumero += ultDig * base10;
            base10 = base10*10;
            numero /= 10;
        }
        aumentoORebajo(nuevoNumero);
        menorPeso(nuevoNumero);
        valor = nuevoNumero;
    }
    
    private int menorPeso(int numero){
        int pesoAux = getPesoCiudadano(numero);
        if(pesoAux < menorPeso){
            menorPeso = pesoAux;
        }
        return menorPeso;
    }
    
    public int getMenorPeso(){
        return menorPeso;
    }
    
    private void aumentoORebajo(int numero){
        if(numero > valor){
            cantVecesAumentoPeso++;
        }else{
            cantVecesRebajoPeso++;
        }
    }
    public int getCantVecesAumentoPeso(){
        return cantVecesAumentoPeso;
    }
    public int getCantVecesRebajoPeso(){
        return cantVecesRebajoPeso;
    }
    private int getPesoCiudadano(int numero){
        int peso = 0;
        while(numero > 0){
            int ultDig = numero % 10;
            peso += ultDig;
            numero /= 10;
        }
        return peso;
    }
    public int getPesoCiudadano(){
        int peso = 0;
        int numero = valor;
        while(numero > 0){
            int ultDig = numero % 10;
            peso += ultDig;
            numero /= 10;
        }
        return peso;
    }
   
}
