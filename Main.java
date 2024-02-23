import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros separados por coma:");

        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                try {
                    String input = scanner.next();
                    numeros[i] = Integer.parseInt(input);
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número entero válido.");
                }
            }
        }

        
        System.out.println("Array original mostrando la posición del array más el valor:");
        mostrarArrayConPosiciones(numeros);

        
        moverPrimosAlPrincipio(numeros);

       
        System.out.println("\nArray con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        mostrarArrayConPosiciones(numeros);

        scanner.close();
    }

    
    public static void mostrarArrayConPosiciones(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

    
    public static void moverPrimosAlPrincipio(int[] array) {
        int indice = 0;

        
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                int temp = array[i];
                array[i] = array[indice];
                array[indice] = temp;
                indice++;
            }
        }
    }

    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

