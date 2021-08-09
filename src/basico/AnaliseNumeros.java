/**
 * Desafio
 * Você deve fazer a leitura de 5 valores inteiros.
 * Em seguida mostre quantos valores informados são pares,
 * quantos valores informados são ímpares,
 * quantos valores informados são positivos e quantos valores informados são negativos.
 * <p>
 * Entrada
 * Você receberá 5 valores inteiros.
 * <p>
 * Saída
 * Exiba a mensagem conforme o exemplo de saída abaixo,
 * sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
 */

package basico;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int n;

        for (int i = 0; i < 5; i++) {
            n = leitor.nextInt();

            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (n > 0) {
                positivo++;
            } else if (n < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
