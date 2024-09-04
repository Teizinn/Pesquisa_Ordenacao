package Trab1;

import java.util.ArrayList;
import java.util.List;

public class GerarAlunos {
    public static List<Aluno> gerarListaAlunos(int quantidade) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            String nome = Aluno.gerarNomeAleatorio();
            int idade = Aluno.gerarIdadeAleatoria();
            alunos.add(new Aluno(nome, idade));
        }
        return alunos;
    }

    public static void main(String[] args) {
        List<Aluno> alunos = GerarAlunos.gerarListaAlunos(60000);

        // Criando cópias da lista para diferentes algoritmos
        List<Aluno> alunosSort = new ArrayList<>(alunos);
        List<Aluno> alunosBolha = new ArrayList<>(alunos);
        List<Aluno> alunosSelecao = new ArrayList<>(alunos);
        List<Aluno> alunosInsercao = new ArrayList<>(alunos);

        // Threads para ordenação
        Thread threadSort = new Thread(() -> {
            OrdenarAlunos.ordenarComSort(alunosSort);
            System.out.println("Ordenação com Sort finalizada");
        });

        Thread threadBolha = new Thread(() -> {
            OrdenarAlunos.ordenarBolha(alunosBolha);
            System.out.println("Ordenação com Bolha finalizada");
        });

        Thread threadSelecao = new Thread(() -> {
            OrdenarAlunos.ordenarSelecao(alunosSelecao);
            System.out.println("Ordenação com Seleção finalizada");
        });

        Thread threadInsercao = new Thread(() -> {
            OrdenarAlunos.ordenarInsercao(alunosInsercao);
            System.out.println("Ordenação com Inserção finalizada");
        });

        // Iniciando as threads
        threadSort.start();
        threadBolha.start();
        threadSelecao.start();
        threadInsercao.start();

        // Esperando as threads terminarem
        try {
            threadSort.join();
            threadBolha.join();
            threadSelecao.join();
            threadInsercao.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas as ordenações foram finalizadas");
    }
}

