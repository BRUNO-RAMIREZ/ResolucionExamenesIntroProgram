
import java.util.*;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main{
    public static ArrayList<ArrayList<Codigo>> generConjunto(){
        ArrayList<ArrayList<Codigo>> conjunto = new ArrayList<ArrayList<Codigo>>();
        Codigo[] a1 = {new Silencio(),new Sonido("DO"),new Sonido("DO"),new Sonido("DO"),new Sonido("RE"),new Silencio(),new Sonido("MI"),new Silencio(),new Sonido("LA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("DO"),new Silencio(),new Sonido("SOL")};
        Codigo[] a2 = {new Sonido("DO"),new Sonido("DO"),new Sonido("DO"),new Sonido("DO"),new Sonido("FA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("DO"),new Silencio(),new Sonido("SOL")};
        Codigo[] a3 = {new Silencio(),new Sonido("DO"),new Sonido("FA"),new Sonido("DO"),new Silencio(),new Sonido("DO"),new Silencio(),new Silencio(),new Sonido("DO"),new Silencio(),new Sonido("SOL"),new Silencio(),new Silencio(),new Sonido("SOL")};
        Codigo[] a4 = {new Silencio(),new Sonido("DO"),new Sonido("DO"),new Sonido("DO"),new Silencio(),new Silencio(),new Sonido("SOL"),new Silencio(),new Sonido("LA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("DO"),new Silencio(),new Sonido("SOL")};
        Codigo[] a5 = {new Silencio(),new Sonido("FA"),new Sonido("DO"),new Sonido("MI"),new Sonido("RE"),new Silencio(),new Sonido("SOL"),new Silencio(),new Sonido("LA"),new Silencio(),new Sonido("FA"),new Silencio(),new Sonido("DO"),new Silencio(),new Sonido("SI")};
        Codigo[] a6 = {new Silencio(),new Sonido("DO"),new Sonido("FA"),new Sonido("DO"),new Silencio(),new Silencio(),new Silencio(),new Sonido("SOL"),new Sonido("SOL"),new Sonido("SOL")};
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a1)));
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a2)));
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a3)));
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a4)));
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a5)));
        conjunto.add(new ArrayList<Codigo>(Arrays.asList(a6)));
        return conjunto;
    }
}