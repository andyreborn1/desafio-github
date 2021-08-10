/**
 * Desafio
 * Thor odeia pegar chuva, e para evitá-la ele começou a usar um sistema de previsão do tempo.
 * Neste sistema ele consegue prever se irá chover no horário em que ele vai para o trabalho
 * e/ou no horário que ele volta do trabalho.
 * <p>
 * Thor também odeia carregar guarda-chuva quando não está chovendo.
 * Para evitar isso, ele vai comprar vários guarda-chuvas e deixá-los guardados em casa e no escritório,
 * e só vai usá-los quando estiver chovendo. Ou seja, se estiver chovendo na hora de ir para o trabalho,
 * ele vai pegar um guarda-chuva que está em sua casa, usá-lo no caminho para o trabalho,
 * e deixá-lo lá. De maneira semelhante, se estiver chovendo na hora de voltar para casa,
 * ele vai pegar um guarda-chuva que está no escritório, usá-lo no caminho para casa, e deixá-lo lá.
 * <p>
 * Dadas as previsões meteorológicas,
 * você terá o desafio de descubrir quantos guarda-chuvas Thor deve comprar e guardar em casa e no escritório,
 * de modo que ele nunca se molhe e nunca precise carregar o guarda-chuva quando não estiver chovendo.
 * <p>
 * <p>
 * Entrada
 * A primeira linha da entrada contém um inteiro N,
 * indicando a quantidade de dias previstos pelo sistema meteorológico (1 <= N <= 1000).
 * <p>
 * Em seguida haverá N linhas, cada uma contendo duas palavras SD e SN,
 * indicando a previsão do tempo para a ida e para a volta do trabalho, respectivamente.
 * Se a palavra for "sol" significa que neste horário fará sol,
 * e se a palavra for "chuva" significa que neste horário irá chover.
 * <p>
 * <p>
 * Saída
 * Para cada caso de teste imprima uma linha contendo dois inteiros C e E,
 * indicando quantos guarda-chuvas Rafael deve comprar e guardar em sua casa e escritório.
 */

package intermediario;

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        leitor.nextLine();


        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;

        for (int i = 0; i < N; i++) {
            String[] line = leitor.nextLine().split(" ");
            String ida = line[0];
            String volta = line[1];
            ida = ida.trim();
            volta = volta.trim();

            if (ida.equals("chuva") && casaSobrando > 0) {
                trabSobrando++;
                casaSobrando--;
            } else if (ida.equals("chuva") && casaSobrando == 0) {
                casaComprado++;
                trabSobrando++;
            }

            if (volta.equals("chuva") && trabSobrando > 0) {
                trabSobrando--;
                casaSobrando++;

            } else if (volta.equals("chuva") && trabSobrando == 0) {
                trabComprado++;
                casaSobrando++;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);
    }
}