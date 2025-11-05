public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;

    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5];
    }

    public Cinema(String nomeCinema, boolean[][] assentos) {
        this.nomeCinema = nomeCinema;
        this.assentos = assentos;
    }

    public void imprimirAssentos() {
        System.out.println("Cinema: " + nomeCinema);
        for (int i = 0; i < assentos.length; i++) {
            System.out.print("Fileira " + (i + 1) + ": ");
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] ? "ocupado " : "livre ");
            }
            System.out.println();
        }
}

    public boolean verificarLotacaoFileira(int numeroFileira, int limite) {
        int idx = numeroFileira - 1; // considerar entrada 1-based
        if (idx < 0 || idx >= assentos.length) {
            throw new IllegalArgumentException("Número de fileira inválido: " + numeroFileira);
        }
        int ocupados = 0;
        for (boolean seat : assentos[idx]) {
            if (seat) ocupados++;
        }
        return ocupados > limite;
    }
}