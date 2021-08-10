/**
 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
 * Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior,
 * conforme o exemplo abaixo. Imprima o vetor N.
 * <p>
 * Entrada
 * A entrada contem um valor de dupla precisão com 4 casas decimais.
 * <p>
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y",
 * onde i é a posição do vetor e Y é o valor armazenado naquela posição.
 * Cada valor do vetor deve ser apresentado com 4 casas decimais.
 */

package intermediario;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        BigDecimal[] array = new BigDecimal[100];
        int size = array.length;

        array[0] = new BigDecimal(X);

        for (int i = 1; i < +size; i++) {
            array[i] = array[i - 1].divide(new BigDecimal(2));
        }

        DecimalFormat format = new DecimalFormat("0.0000");

        for (int i = 0; i < size; i++) {
            System.out.println(String.format("N[" + i + "] = " + format.format(array[i])));
        }
    }
}
