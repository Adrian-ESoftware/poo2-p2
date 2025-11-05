public class MatrizNumerica {
    private String nomeMatriz;
    private int[][] matrizNumeros;

    public MatrizNumerica() {
        this.nomeMatriz = "Matriz Desconhecida";
        this.matrizNumeros = new int[3][3];
    }

    public MatrizNumerica(String nomeMatriz, int[][] matrizNumeros) {
        this.nomeMatriz = (nomeMatriz != null) ? nomeMatriz : "Matriz Desconhecida";
        if (matrizNumeros == null) {
            this.matrizNumeros = new int[3][3];
        } else {
            int rows = matrizNumeros.length;
            int cols = (rows > 0) ? matrizNumeros[0].length : 0;
            this.matrizNumeros = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                int limit = Math.min(cols, matrizNumeros[i].length);
                for (int j = 0; j < limit; j++) {
                    this.matrizNumeros[i][j] = matrizNumeros[i][j];
                }
            }
        }
    }

    public void imprimirMatriz() {
        System.out.println("Nome da matriz: " + nomeMatriz);
        if (matrizNumeros == null) {
            System.out.println("Matriz vazia");
            return;
        }
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.print(matrizNumeros[i][j]);
                if (j < matrizNumeros[i].length - 1) System.out.print("\t");
            }
            System.out.println();
        }
    }

    public boolean verificarDiagonal(int minimo) {
        if (matrizNumeros == null) return false;
        for (int i = 0; i < matrizNumeros.length; i++) {
            if (matrizNumeros[i] == null || matrizNumeros[i].length <= i) return false;
            if (matrizNumeros[i][i] <= minimo) return false;
        }
        return true;
    }
}
