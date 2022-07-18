
public class CajaFuerte{
    private int claveSecretaCaja;
    public CajaFuerte(int clave){
        claveSecretaCaja = clave;
    }
    public String damePista(int claveTentativa){
        String res;
        int claveSecreta = claveSecretaCaja;
        int cont = 0;
        while(claveTentativa > 0){
            int dCT = claveTentativa % 10;
            int dCS = claveSecreta % 10;
            if(dCT > dCS){
                int opcion1 = dCT - dCS;
                int opcion2 = (dCS + 10) - dCT;
                int minimo = Math.min(opcion1,opcion2);
                cont += minimo;
            }else{
                if(dCT < dCS){
                    int opcion1 = dCS - dCT;
                    int opcion2 = (dCT + 10) - dCS;
                    int minimo = Math.min(opcion1,opcion2);
                    cont += minimo;
                }
            }
            claveTentativa /= 10;
            claveSecreta /= 10;
        }
        res = cont + " movimientos";
        return res;
    }
}
