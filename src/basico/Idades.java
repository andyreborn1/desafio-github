/**
 * Faça um algoritmo para ler um número indeterminado de dados,
 * contendo cada um, a idade de um indivíduo.
 * O último dado, que não entrará nos cálculos,
 * contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
 *
 * Entrada
 * A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
 *
 * Saída
 * A saída contém um valor correspondente à média de idade dos indivíduos.
 *
 * A média deve ser impressa com dois dígitos após o ponto decimal
 */

package basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int number;
        double sum=0.0;

        while ((number=scanner.nextInt())>0){
            array.add(number);
        }
        double size = array.size();
        scanner.close();

        sum = array.stream().reduce(0,Integer::sum);
        double media = sum/size;

        System.out.println(String.format("%.2f", media));
    }
}
