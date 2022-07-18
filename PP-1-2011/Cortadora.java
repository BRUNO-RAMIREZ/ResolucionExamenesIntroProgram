
public class Cortadora{
    private int lim;
    private int nroCortes;
    private int costoXTransformacion;
    private int cantTransformaciones;
    public Cortadora(int lim,int costoXTransformacion){
        this.lim = lim;
        nroCortes = 0;
        this.costoXTransformacion = costoXTransformacion;
        cantTransformaciones = 0;
    }
    public String cortar(int patron){
        String res;
        if(simetrico(patron)){
            nroCortes++;
            res = "El numero de transformarciones que se realizo es " + 0;
        }else{
            int cant = cantTransformaciones(patron);
            if(cant != -1){
                cantTransformaciones += cant;
                nroCortes++;
            }
            res = "El numero de transformarciones que se realizo es " + cant;
        }
        return res;
    }
    public int costoOperacion(){
        int costo;
        costo = (cantTransformaciones * costoXTransformacion) + nroCortes;
        return costo;
    }
    public boolean simetrico(int patron){
        int patronInvertido = invertirNumero(patron);
        return patron == patronInvertido;
    }
    public int cantTransformaciones(int patron){
        int cant = 0;
        if(!simetrico(patron)){
            int limite = lim;
            boolean simetrico = false;
            while(limite > 0 && simetrico == false){
                int patronInvertido = invertirNumero(patron);
                int sumaAux = patron + patronInvertido;
                if(simetrico(sumaAux)){
                    simetrico = true;
                }
                patron = sumaAux;
                limite--;
                cant++;
            }
            if(limite == 0){
                cant = -1;
            }
        }
        return cant;
    }
    private int invertirNumero(int num){
        int invertido = 0;
        int cantDigitos = (int)Math.log10(num) + 1;
        while(num > 0){
            int ultDig = num % 10;
            invertido += ultDig * (int)Math.pow(10,cantDigitos-1);
            cantDigitos--;
            num /= 10;
        }
        return invertido;
    }
}
