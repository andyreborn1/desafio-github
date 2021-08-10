/**
 * Desafio
 * O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.
 * <p>
 * Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão uma senha numérica
 * em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada,
 * mas sim pelo número recebido via sms.
 * A ordem de atendimento será decrescente:
 * aqueles que receberam número maior deverão ser atendidos primeiro.
 * <p>
 * Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms,
 * e diga quantos clientes não precisaram trocar de lugar nessa reordenação.
 * <p>
 * Entrada
 * A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.
 * <p>
 * Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000),
 * indicando o número de clientes. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000),
 * onde o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente.
 * <p>
 * Os inteiros acima são dados em ordem de chegada, ou seja,
 * o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila,
 * o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.
 * <p>
 * Saída
 * Para cada caso de teste imprima uma linha, contendo um inteiro,
 * indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada.
 */

package intermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class FilaDoBanco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        for (int i = 0; i < tests; i++) {
            int clients = Integer.parseInt(br.readLine());

            String[] queue = br.readLine().split(" ");
            Integer[] newQueue = new Integer[queue.length];
            Integer[] sortedQueue = new Integer[queue.length];
            int s = 0;

            for (int j = 0; j < queue.length; j++) {
                int n = Integer.parseInt(queue[j]);
                newQueue[j] = n;
                sortedQueue[j] = n;
            }

            Arrays.sort(sortedQueue, Collections.reverseOrder());

            for (int j = 0; j < queue.length; j++) {
                if (newQueue[j].equals(sortedQueue[j])) {
                    s++;
                }
            }
            System.out.println(s);
        }

    }
}
