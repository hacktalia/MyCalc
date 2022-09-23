
import java.util.Scanner;

public class Calculadora {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Mete hora :");
        int hora = sc.nextInt();

        if(hora < 0 || hora >23) {
            System.out.println("La hora es incorrecta");
            System.exit(1);
        }

        System.out.println("Mete minutos :");
        int minutos = sc.nextInt();

        if(minutos < 0 || minutos > 59) {
            System.out.println("Los minutos son incorrectos");
            System.exit(1);
        }

        System.out.println("Mete segundos :");
        int segundos = sc.nextInt();

        if(segundos < 0 || segundos > 59) {
            System.out.println("Los segundos son incorrectos");
            System.exit(1);
        }

        System.out.println("La hora es correcta");
        
    }
}