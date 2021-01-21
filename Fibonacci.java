import java.util.Scanner;

public class Fibonacci{
    public static void main(String []args){
        int anterior = 0, actual = 1, proximo = 0;

        System.out.print("Quantos termos quer apresentar? ");
        int n = new Scanner(System.in).nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print(proximo+"; ");
            proximo = anterior + actual;
            actual = anterior;
            anterior = proximo;
        }
    }
}