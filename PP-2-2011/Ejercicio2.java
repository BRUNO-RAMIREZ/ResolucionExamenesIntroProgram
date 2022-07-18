
public class Ejercicio2{
    public String estaSonriendo(int nroVotos, String sec){
        String veredicto;
        int cantSonriendo = 0;
        int cantTristes = 0;
        int cantSerios = 0;
        for(int i=0; i<sec.length(); i++){
            char actual = sec.charAt(i);
            if(actual == ')'){
                cantSonriendo++;
            }else if(actual == '|'){
                cantSerios++;
            }else if(actual == '('){
                cantTristes++;
            }
        }
        if(cantSonriendo > nroVotos/2){
            veredicto = ":)";
        }else if(cantTristes > nroVotos/2){
            veredicto = ":(";
        }else if(cantSerios > nroVotos/2){
            if(cantSonriendo > cantTristes){
                veredicto = ":)";
            }else{
                veredicto =  ":(";
            }
        }else{
            int sumaSonriendo = cantSonriendo + cantSerios;
            int sumaTristes = cantTristes + cantSerios;
            if(sumaSonriendo >= sumaTristes){
                veredicto = ":)";
            }else{
                veredicto = ":(";
            }
        }
        return veredicto;
    }
}
