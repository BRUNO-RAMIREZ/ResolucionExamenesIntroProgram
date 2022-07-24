
public class Robot{
    public int Ejercicio1(int num){
        int cont = 0;
        while(num != 0){
            int potencia = encontrarPotencia2MasProximo(num);
            num -= potencia;
            cont++;
        }
        return cont;
    }
    private int encontrarPotencia2MasProximo(int num){
        int res = 0;
        int i = 0;
        while(res < num){
            res = (int)Math.pow(2,i);
            i++;
        }
        if(res > num){
            res = (int)Math.pow(2,i-2);
        }
        return res;
    }
    public int Ejercicio2(int a, int b){
        int resultado;
        int incognita;
        incognita = a * b;
        while(a != b){
            if(a > b){
                a = a / (b+1);
            }else{
                b = b / (a+1);
            }
        }
        resultado = incognita / (a*b);
        return resultado;
    }
    
    public int Ejercicio3(int valor, int nivel){
        int dig;
        int nuevoValor = 0;
        boolean par = true;
        int acarreo = 0;
        int desplazamiento = 1;
        while(valor > 0){
            dig = valor % 10;
            if(par){
                nuevoValor = (dig/nivel + acarreo) * desplazamiento + nuevoValor;
            }else{
                acarreo = (dig*nivel)/10;
                nuevoValor = ((dig*nivel)%10)*desplazamiento + nuevoValor;
            }
            par = !par;
            desplazamiento = desplazamiento * 10;
            valor = valor / 10;
        }
        return nuevoValor;
    }
}
