
public class Ejercicio2{
    public String misterio3(){
        String res = "";
        int x, y;
        int n = 8;
        int i = 1;
        while ( i < n){
            x = n / i;
            y = n % i;
            for(int j = 1; j < x; j++){
                res = res + i + " + ";
            }
            if(y == 0 ){
                res = res + i;
            }
            else{
                res = res + i + " + " + y;
            }
            res = res + "\n";
            i++;
        }
        return res;
    }
}
