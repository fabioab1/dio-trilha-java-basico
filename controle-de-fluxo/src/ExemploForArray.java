public class ExemploForArray {
    public static void main (String [] args) {
        // Em arrays, o índice inicial é 0
        String alunos[] = {"FÁBIO", "FELIPE", "ANA"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice " + i + " é o/a " + alunos[i] + ".");
        }

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno + ".");
        }
    }
}
