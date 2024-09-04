package Trab1;
import java.util.List;
import java.util.Collections;

public class OrdenarAlunos {

    // Sort
    public static void ordenarComSort(List<Aluno> alunos) {
        Collections.sort(alunos);
    }

    //Bolha
    public static void ordenarBolha(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alunos.get(j).compareTo(alunos.get(j + 1)) > 0) {
                    Aluno temp = alunos.get(j);
                    alunos.set(j, alunos.get(j + 1));
                    alunos.set(j + 1, temp);
                }
            }
        }
    }

    // Seleção
    public static void ordenarSelecao(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (alunos.get(j).compareTo(alunos.get(min_idx)) < 0) {
                    min_idx = j;
                }
            }
            Aluno temp = alunos.get(min_idx);
            alunos.set(min_idx, alunos.get(i));
            alunos.set(i, temp);
        }
    }

    // Inserção
    public static void ordenarInsercao(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 1; i < n; i++) {
            Aluno key = alunos.get(i);
            int j = i - 1;

            while (j >= 0 && alunos.get(j).compareTo(key) > 0) {
                alunos.set(j + 1, alunos.get(j));
                j = j - 1;
            }
            alunos.set(j + 1, key);
        }
    }
}

