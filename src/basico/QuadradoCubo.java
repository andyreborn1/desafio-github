/**
 * Desafio
 * Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000).
 * Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
 *
 * Entrada
 * O arquivo de entrada contém um número inteiro positivo N.
 *
 * Saída
 * Imprima a saída conforme o exemplo fornecido.
 */

package basico;

import java.io.IOException;
import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %.0f %.0f\n", i+1, Math.pow(i+1,2),Math.pow(i+1,3));
        }

    }
}
