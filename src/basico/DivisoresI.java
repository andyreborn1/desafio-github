/**
 * Ler um número inteiro N e calcular todos os seus divisores.
 * <p>
 * Entrada
 * O arquivo de entrada contém um valor inteiro.
 * <p>
 * Saída
 * Escreva todos os divisores positivos de N, um valor por linha
 */

package basico;

import java.io.IOException;
import java.util.Scanner;

public class DivisoresI {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) System.out.println(i);
        }
    }
}
