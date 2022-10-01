import java.util.*;

/**
 * Write a description of class Main3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main3{
    public static ArrayList<Sonido> generConjunto(){
        ArrayList<Sonido> patron = new ArrayList<Sonido>();
        patron.add(new Sonido("DO"));
        patron.add(new Sonido("RE"));
        patron.add(new Sonido("MI"));
        patron.add(new Sonido("FA"));
        patron.add(new Sonido("SOL"));
        return patron;
    }
    
}
