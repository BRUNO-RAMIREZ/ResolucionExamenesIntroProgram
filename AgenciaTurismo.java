import java.util.ArrayList;

public class AgenciaTurismo{
    private ArrayList<Paseo> paseos;
    
    public AgenciaTurismo(){
        paseos = new ArrayList<Paseo>();
    }
    
    public void cargarPaseoHistorico(){
        Paseo pHistorico = new Paseo("Historico");
            
        Iglesia i = new Iglesia("Catedra1",0.5f,1574);
        i.agregarCaracteristicaSitio("remodelada en 1619");
        i.agregarCaracteristicaSitio("remodelada en 1701-1735");
        pHistorico.agregar(i);
        Museo m = new Museo("Museo Arqueologico",2f,20);
        m.agregarCaracteristicaSitio("creada en 1951 por Dick Edgar Ibarra Grasso");
        m.agregarCaracteristicaSitio("cuenta con aproximadamente 40.000 piezas arqueologicas etnograficas y paleontologicas");
        pHistorico.agregar(i);
        
        paseos.add(pHistorico);
    }
    
    public void cargarPaseoDiversion(){
        Paseo pDiversion = new Paseo("Parques");
        
        Parque p = new Parque("Mariscal Santa Cruz",2f,"MENORES");
        pDiversion.agregar(p);
        
        paseos.add(pDiversion);
    }
    
    public void mostrarDuracionPaseos(){
        for(Paseo p : paseos){
            System.out.println("Paseo " + p.getNombre()
                                + " dura " + p.duracion() + " horas");
        }
    }
}
