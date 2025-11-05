public class SalaDeAula {
    private String nomeTurma;
    private int[][] notaAlunos;

    public SalaDeAula() {
        this.nomeTurma = "Turma Desconhecida";
        this.notaAlunos = new int[5][3];

    }

    public SalaDeAula(String nomeTurma, int[][] notaAlunos) {
        this.nomeTurma = nomeTurma;
        this.notaAlunos = notaAlunos;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome da Turma: " + this.nomeTurma);
        System.out.println("Notas dos Alunos:" + this.notaAlunos);
    }

    public boolean verificarNorasAcima() {
        for (int i = 0; i < notaAlunos.length; i++) {
            for (int j = 0; j < notaAlunos[i].length; j++) {
                if (notaAlunos[i][j] >= 6) {
                    return true;
                }
            }
        }
        return false;
    }

}
