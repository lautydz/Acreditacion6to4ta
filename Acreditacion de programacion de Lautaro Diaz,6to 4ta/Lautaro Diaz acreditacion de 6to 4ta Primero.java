import java.util.Scanner;

public class CalculadoraEdadCanina {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de su perro en años: ");

        int edadPerro = scanner.nextInt();

        int edadHumana = edadPerro * 7;
        System.out.println("La edad del perro en años humanos es " + edadHumana + " años.");
        scanner.close();
    }
}
