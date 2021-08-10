/**
 * Desafio
 * Crie um programa onde você receberá valores inteiros não negativos como entrada.
 * <p>
 * Ordene estes valores de acordo com o seguinte critério:
 * <p>
 * Primeiro os Pares
 * Depois os Ímpares
 * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
 * <p>
 * Entrada
 * A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
 * Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão,
 * cada uma delas, um valor inteiro não negativo.
 * <p>
 * Saída
 * Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
 * Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo
 */

package intermediario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenandoParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        for (Integer number : array) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }

        even.stream().sorted().forEach(System.out::println);
        odd.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
