
/**
 * Write a description of class Masa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masa{
    private double radio;
    public Masa(double radio){
        this.radio = radio;
    }
    public double getDiametro(){
        return radio + radio;
    }
    public double getAreaOcupadaEnCaja(){
        return Math.pow(getDiametro(),2);
    }
    public double getAreaMasita(){
        return Math.PI * radio * radio;
    }
}
