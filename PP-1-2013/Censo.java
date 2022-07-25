
public class Censo{
    private int totalPoblacion;
    private int numeroAbundantes;
    public Censo(int totalPoblacion){
        this.totalPoblacion = totalPoblacion;
        numeroAbundantes = 0;
    }
    public String censar(int estadoFinanciero){
        String reporte;
        int suma = 1;
        for(int i=2; i<=(estadoFinanciero/2); i++){
            if(estadoFinanciero % i == 0){
                suma = suma + i;
            }
        }
        if(suma > estadoFinanciero){
            numeroAbundantes++;
            reporte = "Es un numero abundante";
        }else{
            reporte = "Es un numero deficiente";
        }
        return reporte;
    }
    public String reportar(){
        String reporteAbundantes = rellenarAsteriscos(numeroAbundantes);
        String reporteDeficientes = rellenarAsteriscos(totalPoblacion - numeroAbundantes);
        String reporteEspaciosBlancos = rellenarEspaciosBlancos(numeroAbundantes,totalPoblacion-numeroAbundantes);
        String reporte = "";
        if(reporteAbundantes.length() > reporteDeficientes.length()){
            reporteDeficientes = reporteEspaciosBlancos + reporteDeficientes;
        }else{
            reporteAbundantes = reporteEspaciosBlancos + reporteAbundantes;
        }
        int i=0, j=0;
        while(i < reporteAbundantes.length() || j < reporteDeficientes.length()){
            reporte = reporte + reporteAbundantes.charAt(i) + "\t" + reporteDeficientes.charAt(j) + "\n";
            i++;
            j++;
        }
        reporte = reporte + "abu" + "\t" + "def";
        return reporte;
    }
    private String rellenarAsteriscos(int numero){
        String reporte = "";
        for(int i=0; i<numero; i++){
            reporte = reporte + "*";
        }
        return reporte;
    }
    private String rellenarEspaciosBlancos(int numAbundantes, int numDeficientes){
        String reporte = "";
        if(numAbundantes>numDeficientes){
            for(int i=0; i<numAbundantes - numDeficientes; i++){
                reporte = reporte + " ";
            }
        }else if(numAbundantes < numDeficientes){
            for(int i=0; i<numDeficientes - numAbundantes; i++){
                reporte = reporte + " ";
            }
        }
        return reporte;
    }
}
