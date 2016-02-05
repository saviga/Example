
import java.util.Scanner;

public class Listaprimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero para confirmar si es primo:");
        int x= sc.nextInt();
            for(int i=1;i<x;i++){
            System.out.printf("%d",esPrimo(i));
            }
        
             
    }
    
    public static boolean esPrimo(int x){
        for(int div=2;div<x;div++)
            if(x%div==0)
                return false;
        return true;
    }
}