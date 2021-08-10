/**
 * Desafio
 * Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.
 * <p>
 * Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string,
 * em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.
 * <p>
 * As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
 * <p>
 * Entrada
 * A entrada contém vários casos de teste.
 * A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres,
 * cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.
 * <p>
 * Saída
 * Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
 */

package intermediario;

import java.util.Scanner;

public class CombinacaoDeStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {

            StringBuilder sb = new StringBuilder();
            String[] words = scan.nextLine().split(" ");

            int max = Math.max(words[0].length(), words[1].length());

            for (int j = 0; j < max; j++) {

                if (j < words[0].length()) {
                    sb.append(words[0].charAt(j));
                }

                if (j < words[1].length()) {
                    sb.append(words[1].charAt(j));
                }
            }
            System.out.println(sb.toString());
        }

    }
}
