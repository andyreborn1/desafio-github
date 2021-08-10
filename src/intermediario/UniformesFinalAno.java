/**
 * Desafio
 * O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano.
 * Após algumas conversas,
 * ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho.
 * Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas,
 * relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.
 * <p>
 * Entrada
 * Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo,
 * que indica a quantidade de uniformes a serem feitas para aquela turma.
 * As próximas N*2 linhas contém informações de cada um dos uniformes
 * (serão duas linhas de informação para cada uniforme).
 * A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme
 * ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G".
 * A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.
 * <p>
 * Saída
 * Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente,
 * seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.
 */

package intermediario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class UniformesFinalAno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n;
        ArrayList<Tshirt> tshirts = new ArrayList<>();

        while (!(n = br.readLine()).equals("0")) {
            int num = Integer.parseInt(n);

            for (int i = 0; i < num; i++) {
                Tshirt tshirt = new Tshirt();

                tshirt.owner = br.readLine();
                String[] line = br.readLine().split(" ");
                tshirt.color = line[0];
                tshirt.size = line[1];
                tshirts.add(tshirt);
            }

            tshirts.stream().sorted(
                    Comparator.comparing(Tshirt::getColor).reversed()
                            .thenComparing(Tshirt::getSize).reversed()
                            .thenComparing(Tshirt::getOwner)
            ).forEach(System.out::println);
        }

    }

    static class Tshirt {

        private String size;
        private String color;
        private String owner;

        public String getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }

        public String getOwner() {
            return owner;
        }

        @Override
        public String toString() {
            return this.getColor() + " " + this.getSize() + " " + this.getOwner();
        }
    }
}
