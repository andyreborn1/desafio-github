/**
 * Desafio
 * A corrida de tartarugas é um esporte que cresceu muito nos últimos anos,
 * fazendo com que vários competidores se dediquem a capturar tartarugas rápidas,
 * e treina-las para faturar milhões em corridas pelo mundo.
 * Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil,
 * pois quase todos esses répteis são bem lentos.
 * Cada tartaruga é classificada em um nível dependendo de sua velocidade:
 * <p>
 * Nível 1: Se a velocidade é menor que 10 cm/h .
 * Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
 * Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
 * <p>
 * Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.
 * <p>
 * Entrada
 * A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas:
 * A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo,
 * e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada tartaruga do grupo.
 * <p>
 * Saída
 * Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.
 */
package intermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorridaDeTartarugas {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int m = 2;
        do {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            Integer inteiro[] = new Integer[n];
            int veloz = 0;

            for (int i = 0; i < n; i++) {
                inteiro[i] = Integer.parseInt(s[i]);

                if (inteiro[i] > veloz) {
                    veloz = inteiro[i];
                }
            }

            if (veloz < 10) {
                System.out.println(1);
            }
            if (veloz >= 10 && veloz < 20) {
                System.out.println(2);
            }
            if (veloz >= 20) {
                System.out.println(3);
            }
            m--;

        } while (m >= 0);
    }
}
