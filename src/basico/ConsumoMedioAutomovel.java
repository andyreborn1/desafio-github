/**
 * Desafio
 * Você deve calcular o consumo médio de um automóvel onde será informada a distância total
 * percorrida (em Km) e o total de combustível consumido (em litros).
 *
 * Entrada
 * Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km),
 * e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.
 *
 * Saída
 * Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula),
 * incluindo no final a mensagem "km/l".
 */

package basico;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double media = X/Y ;
        System.out.println(String.format("%.3f km/l",media));
    }
}
