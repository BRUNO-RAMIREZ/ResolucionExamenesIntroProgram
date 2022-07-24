
public class Robot{
    public void ejercicio1(int a, int b, int c){
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int x;
        int y;
        
        d = Math.abs(a+b);
        e = Math.abs(a-b);
        
        x = (d+e)/2;
        y = (d-e)/2;
        
        f = Math.abs(x+c);
        g = Math.abs(x-c);
        
        x = (f+g)/2;
        
        h = Math.abs(c+y);
        i = Math.abs(c-y);
        
        y = (h - i) / 2;
        
        System.out.println("mayor: "+x);
        System.out.println("menor: "+y);
    }
    
    public Tupla ejercicio2(int data){
        Tupla coordenada = null;
        int ly = 0;
        int lx = 0;
        int y = 0;
        int x = 0;
        
        ly = data % 10;
        lx = (data / 10) % 10;
        
        data = data / 100;
        
        y = data % (int)(Math.pow(10,ly));
        data = data / (int)(Math.pow(10,ly));
        x = data % (int)(Math.pow(10,lx));
        data = data / (int)(Math.pow(10,lx));
        
        if(data % 2 == 0){
            if(x % 10 == 6){
                x = x - 6;
            }else if(x % 10 == 0){
                x = x - 5;
            }else{
                x--;
            }
            if(x % 3 == 0){
                y--;
            }else{}
        }else{
            if(x % 10 == 0){
                x = x - 5;
            }else{}
            if(x % 3 == 0){
                y++;
            }else {}
        }
        coordenada = new Tupla(x,y);
        return coordenada;
        
        
    }
    
    public void ejercicio3(){
        /***SELECCIONAR VERDADERO O FALSO
         * Una expresion se evalua R = VERDADERO
         * Una asignacion es una expresion R = VERDADERO
         * ELSE es una instruccion del lenguaje R = VERDADERO
         * a = b == c; es una instruccion dado que a,b,c son booleanos R = VERDADERO
         * a = b > c; es una instruccion dado que a,b,c son booleanos R = VERDADERO
        */
    }
}
