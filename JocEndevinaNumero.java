import java.util.Random;
import java.util.Scanner;

public class JocEndevinaNumero {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner teclat = new Scanner(System.in);

        int numero = random.nextInt(50) + 1;

        System.out.println("Benvingut al joc i bon dia!");
        System.out.print("Endevina el número (1-50): ");
        System.out.print("Soy el ilyassssss");

        int usuari = teclat.nextInt();

        if (usuari == numero) {
            System.out.println("L'has encertat!");
        } else {
            System.out.println("No l'has encertat.");
            System.out.println("El número era: " + numero);
        }

        teclat.close();
    }
}
