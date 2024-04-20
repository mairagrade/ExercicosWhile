import java.util.Scanner;

public class Exercicios01While {
    public static void main(String[] args) throws Exception {
        // Utilizando (While), construir um programa que apresente a soma dos cem primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero ");
        int numero = scanner.nextInt();

        int contador = 1 + 2 + 3;

        while (contador <= 99) {
            System.out.printf("%d + %d = %d\n", numero, contador, (numero + contador ));
            contador = contador + 99;            
        }
        
        scanner.close();


        
    }
}
