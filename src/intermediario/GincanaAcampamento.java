/**
 * Desafio
 * Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias por uma semana.
 * Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade,
 * sempre com um adulto que, além de dormir com o grupo no cabana,
 * também são responsáveis por criar e executar várias atividades,
 * como por exemplo jogos, excursões, Gincanas Noturnas, etc.
 * <p>
 * No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo
 * (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno,
 * que seria o vencedor.
 * <p>
 * No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500.
 * Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou no círculo,
 * o número correspondente à ficha que o primeiro detém.
 * O aluno onde o número contado cair, deve ser retirado do grupo,
 * e a contagem inicia novamente segundo a ficha do aluno que acabou de ser eliminado.
 * Para ficar mais interessante, quando o valor que consta na ficha é par,
 * a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar,
 * a contagem é feita no sentido anti-horário.
 * <p>
 * Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba
 * previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.
 * <p>
 * Entrada
 * A entrada contém vários casos de teste.
 * A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 100),
 * indicando a quantidade de alunos que farão parte de cada círculo.
 * Em seguida, as N linhas de cada caso de teste conterão duas informações,
 * o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de cada aluno, separados por um espaço,
 * na ordem de entrada na formação do círculo inicial.
 * <p>
 * OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas,
 * sem acentos, e o caractere “_”.
 * O final da entrada é indicado pelo número zero.
 * <p>
 * Saída
 * Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx,
 * com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.
 */

package intermediario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaAcampamento {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N;

        while ((N = scanner.nextInt()) > 0) {
            List<Student> studentList = new ArrayList<>();
            String name;
            int value;

            for (int i = 0; i < N; i++) {
                name = scanner.next().trim();
                value = Integer.parseInt(scanner.next().trim());

                studentList.add(new Student(name, value));
            }

            String winer = winner(studentList);
            System.out.println("Vencedor(a): " + winer);
        }
    }

    public static String winner(List<Student> list) {

        int atual = 0;
        int deletedIndex = 0;
        int voucher = list.get(atual).getValue();
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            int actualSize = list.size();
            if (voucher == 0) {
                deletedIndex = atual;
            } else if (voucher % 2 == 0) {
                deletedIndex = (actualSize - (voucher % actualSize) + atual) % actualSize;
                voucher = list.get(deletedIndex).getValue();
            } else if (voucher % 2 != 0) {
                deletedIndex = (voucher % actualSize + atual) % actualSize;
                voucher = list.get(deletedIndex).getValue();
            }

            list.remove(deletedIndex);

            atual = (voucher % 2 == 0) ?
                    ((deletedIndex <= list.size() - 1) ?
                            deletedIndex : 0) :
                    ((deletedIndex == 0) ?
                            (list.size() - 1) : (deletedIndex - 1));
        }
        return list.get(0).getName();
    }

    public static class Student {
        private String name;
        private int value;

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        public Student(String name, int value) {
            this.name = name;
            this.value = value;

        }

    }
}
