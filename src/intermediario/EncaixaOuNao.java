/**
 * Paulinho tem em suas mãos um novo problema.
 * Agora a sua professora lhe pediu que construísse um programa para verificar,
 * à partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.
 * <p>
 * Entrada
 * A entrada consiste de vários casos de teste.
 * A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste.
 * Cada caso de teste consiste de dois valores A e B maiores que zero, cada um deles podendo ter até 1000 dígitos.
 * <p>
 * Saída
 * Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor,
 * confome exemplo abaixo.
 */

package intermediario;

import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
            String A = leitor.next();
            String B = leitor.next();
            int aLenght = A.length();
            int bLenght = B.length();

            if (bLenght > aLenght) {
                System.out.println("nao encaixa");
            } else {
                if (A.substring(aLenght - bLenght, aLenght).equals(B)) {
                    System.out.println("encaixa");
                } else {
                    System.out.println("nao encaixa");
                }
            }
        }

    }
}
