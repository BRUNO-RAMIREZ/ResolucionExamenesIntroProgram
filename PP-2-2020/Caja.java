
public class Caja{
    private int nroMasitas;
    private boolean cerrado;
    private double base;
    private double altura;
    private double areaOcupada;
    public Caja(double base, double altura){
        cerrado = false;
        this.base = base;
        this.altura = altura;
        nroMasitas = 0;
        areaOcupada = 0;
    }
    public double getAreaCaja(){
        return base * altura;
    }
    public boolean estaCerrado(){
        boolean res;
        if(cerrado == true){
            res = true;
        }else{
            res = false;
        }
        return res;
    }
    public String getDatosCaja(){
        String reporte = "Caja con " + this.getNroMasitas() + " masitas, usando " + getAreaOcupada() + " del espacio";
        if(cerrado){
            reporte = reporte + "\nCaja llena";
        }else{
            reporte = reporte + "\nCaja con espacio";
        }
        return reporte;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public void cerrarCajita(){
        cerrado = true;
    }
    public int getNroMasitas(){
        return nroMasitas;
    }
    public void poner(Masa masita){
        double nuevoY = altura - masita.getDiametro();
        double area1 = base * nuevoY;
        double nuevoX = base - masita.getDiametro();
        double area2 = nuevoX * altura;
        if(area1 > area2){
            altura = nuevoY;
        }else if(area1 < area2){
            base = nuevoX;
        }else{
            altura = nuevoY;
            base = nuevoX;
        }
        areaOcupada += masita.getAreaMasita();
        nroMasitas++;
    }
    public double getAreaOcupada(){
        return areaOcupada;
    }
}
