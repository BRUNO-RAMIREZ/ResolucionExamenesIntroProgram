
public class Ejercicio2{
    public int misterio(int num1, int num2){
        num1 = magico(num2,num1);
        num2 = num1 + magico(num1,num2);
        return num2;
    }
    public int magico(int num1, int num2){
        int aux;
        aux = num1 + num2;
        num2 = num2 - aux % 2;
        return num2;
    }
}
