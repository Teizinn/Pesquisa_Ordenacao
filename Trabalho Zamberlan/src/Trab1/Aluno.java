package Trab1;

import java.util.Random;

    public class Aluno implements Comparable<Aluno> {
        private String nome;
        private int idade;

        //construtor
        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

            //compara nome e se for igual idade
        @Override
        public int compareTo(Aluno outroAluno) {
            int nomeComparison = this.nome.compareTo(outroAluno.getNome());
            if (nomeComparison != 0) {
                return nomeComparison;
            } else {
                return Integer.compare(this.idade, outroAluno.getIdade());
            }
        }
        @Override
        public String toString() {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }

        // Método para gerar nomes aleatórios
        public static String gerarNomeAleatorio() {
            String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia", "Leonardo", "Mariana", "Felipe", "Alexandre", "Gilberto", "Eduarda", "Maria", "Claudio"};
            Random random = new Random();
            return nomes[random.nextInt(nomes.length)] + " " + (char) (random.nextInt(26) + 'A') + ". " + (char) (random.nextInt(26) + 'A') + ".";
        }

        // Método para gerar idade aleatória entre 18 e 70
        public static int gerarIdadeAleatoria() {
            Random random = new Random();
            return random.nextInt(53) + 18;
        }
    }
