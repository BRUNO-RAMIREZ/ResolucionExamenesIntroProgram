import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Interceptador{
    ArrayList<Sonido> patron;
    ArrayList<Sonido> mensajeModificador;
    public Interceptador(ArrayList<Sonido> patron, ArrayList<Sonido> mensajeModificador){
        this.patron = patron;
        this.mensajeModificador = mensajeModificador;
    }

    public ArrayList<Sonido> getPatron(){
        return patron;
    }

    public ArrayList<Sonido> mensajeModificador(){
        return mensajeModificador;
    }

    public void setPatron(ArrayList<Sonido> patron){
        this.patron = patron;
    }

    public void setMensajeModificador(ArrayList<Sonido> mensajeModificador){
        this.mensajeModificador = mensajeModificador;
    }

    public ArrayList<ArrayList<Codigo>> interceptarMensajes(ArrayList<ArrayList<Codigo>> conjuntoMensajes){
        ArrayList<ArrayList<Codigo>> subConjuntoMensajes = new ArrayList<ArrayList<Codigo>>();
        for(ArrayList<Codigo> mensaje : conjuntoMensajes){
            ArrayList<Codigo> codigosNuevos = new ArrayList<Codigo>();
            boolean band = true;
            int pos = 0;
            int cont = 0;
            int silencios = 0;
            for(Codigo cod : mensaje){
                boolean band2 = true;
                if(!(cod instanceof Silencio)){
                    if(band == true){
                        codigosNuevos.add(cod);
                        band = false;
                    }else{
                        if(!(codigosNuevos.get(pos).getRepresentacion().equals(cod.getRepresentacion()))){
                            codigosNuevos.add(cod);
                            pos++;
                        }
                    }
                    band2 = false;
                }
                if(band2 == true){
                    cont++;
                    if(cont == 3){
                        silencios = 3;
                    }
                }else{
                    cont = 0;
                }
            }
            if(silencios != 3){
                if(cumplePatron(codigosNuevos) == true){
                    subConjuntoMensajes.add(mensaje);
                }
            }
        }
        return subConjuntoMensajes;
    }

    private boolean cumplePatron(ArrayList<Codigo> posibleCandidato){
        boolean cumple = true;
        for(int i = 0; i < patron.size() && i < posibleCandidato.size() && cumple == true; i++){
            String codPatron = patron.get(i).getRepresentacion();
            String codCodNuevo = posibleCandidato.get(i).getRepresentacion();
            if(!(codPatron.equals(codCodNuevo))){
                cumple = false;
            }
        }
        return cumple;
    }

    private boolean noCumplePatron(ArrayList<Codigo> mensaje){
        boolean noCumple = true;
        boolean band = true;
        int pos = 0;         
        ArrayList<Codigo> codigosNuevos = new ArrayList<Codigo>();
        for(Codigo cod : mensaje){
            if(!(cod instanceof Silencio)){
                if(band == true){
                    codigosNuevos.add(cod);
                    band = false;
                }else{
                    if(!(codigosNuevos.get(pos).getRepresentacion().equals(cod.getRepresentacion()))){
                        codigosNuevos.add(cod);
                        pos++;
                    }
                }
            }
        }
        if(cumplePatron(codigosNuevos) == true){
            noCumple = false;
        }
        return noCumple;
    }

    public ArrayList<ArrayList<Codigo>> cambiarMensaje(ArrayList<ArrayList<Codigo>> conjuntoMensajes){
        ArrayList<ArrayList<Codigo>> mensajesNuevos = new ArrayList<ArrayList<Codigo>>();
        int posAleatoriaMens = (int)(Math.random() * mensajeModificador.size());
        Codigo cod = mensajeModificador.get(posAleatoriaMens);
        ArrayList<ArrayList<Codigo>> subConjuntos = interceptarMensajes(conjuntoMensajes);
        for(ArrayList<Codigo> codigosAArreglar : subConjuntos){
            boolean arreglado = false;
            while(arreglado == false){
                int pos = (int)(Math.random() * codigosAArreglar.size());
                codigosAArreglar.set(pos,cod);
                if(noCumplePatron(codigosAArreglar)){
                    arreglado = true;
                }else{
                    posAleatoriaMens = (int)(Math.random() * mensajeModificador.size());
                    cod = mensajeModificador.get(posAleatoriaMens);
                }
            }
            mensajesNuevos.add(codigosAArreglar);
        }
        return mensajesNuevos;
    }

}
