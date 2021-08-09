/**
 * Desafio
 * Crie um programa que leia 6 valores.
 * Você poderá receber valores negativos e/ou positivos como entrada,
 * devendo desconsiderar os valores nulos.
 * Em seguida, apresente a quantidade de valores positivos digitados.
 * <p>
 * Entrada
 * Você receberá seis valores, negativos e/ou positivos.
 * <p>
 * Saída
 * Exiba uma mensagem dizendo quantos valores positivos
 * foram lidos assim como é exibido abaixo no exemplo de saída.
 * Não esqueça da mensagem "valores positivos" ao final
 */

package basico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        List<Double> numeros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            numeros.add(leitor.nextDouble());
        }

        int positivos = numeros.stream().filter(numero -> numero > 0).toArray().length;
        System.out.println(positivos + " valores positivos");
    }
}
