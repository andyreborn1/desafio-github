/**
 * Desafio
 * Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores.
 * Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).
 *
 * Entrada
 * A entrada contém 2 valores inteiros.
 *
 * Saída
 * Exiba a variável PROD conforme exemplo abaixo,
 * tendo obrigatoriamente um espaço em branco antes e depois da igualdade.
 */

package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiplicacaoSimples {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int total = a * b;
        System.out.println("PROD = " + total);
    }
}
