
public class Cargador{
    Caja caja;
    public Cargador(){
        caja = null;
    }
    public String agregarCaja(Caja cajita){
        String res;
        if(caja != null){
            if(caja.estaCerrado()){
                res = "Caja registrada";
                caja = cajita;
            }else{
                res = "Aun hay caja por llenar";
            }     
        }else{
            caja = cajita;
            res = "Caja registrada";
        }
        return res;
    }
    public String ponerMasita(Masa masita){
        String reporte = "";
        if(caja != null){
            if(!caja.estaCerrado()){
                double areaOcupadaMasita = masita.getAreaOcupadaEnCaja();
                if(caja.getAreaCaja() >= areaOcupadaMasita){
                    caja.poner(masita);
                    reporte = "Masita ubicada, caja de " + caja.getBase() + " x " + caja.getAltura();
                    
                }else{
                    caja.cerrarCajita();
                    reporte = "No se puede poner masita\n" + caja.getDatosCaja();
                }
            }else{
                reporte = "No hay caja para poner masita";
            }
        }else{
            reporte = "No hay caja para poner masita";
        }
        return reporte;
    }
}
