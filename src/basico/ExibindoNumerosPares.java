/**
 * Desafios
 * Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 *
 * Entrada
 * Você receberá 1 valor inteiro N, onde N > 0.
 *
 * Saída
 * Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 */

package basico;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
