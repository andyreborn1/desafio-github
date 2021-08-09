/**
 * Desafio
 * Faça a leitura de um valor inteiro.
 * Em seguida, calcule o menor número de notas possíveis (cédulas)
 * onde o valor pode ser decomposto.
 * As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
 * Na sequência mostre o valor lido e a relação de notas necessárias.
 * <p>
 * Entrada
 * Você receberá um valor inteiro N (0 < N < 1000000).
 * <p>
 * Saída
 * Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias,
 * seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.
 */

package basico;

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;

        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        int quantNotas[] = new int[7];

        for (int i = 0; i < 7; i++) {
            quantNotas[i] = atual / notas[i];
            atual -= quantNotas[i] * notas[i];
        }

        System.out.println(notasInseridas);

        for (int i = 0; i < 7; i++) {
            System.out.format("%d nota(s) de R$ %d,00%n", quantNotas[i], notas[i]);
        }
    }
}
