public class EstoqueLoja {
    private String nomeProduto;
    private int[][] quantidadesPorLote;

    public EstoqueLoja() {
        this.nomeProduto = "Produto Desconhecido";
        this.quantidadesPorLote = new int[4][2];
    }

    public EstoqueLoja(String nomeProduto, int[][] quantidadesPorLote) {
        this.nomeProduto = nomeProduto;
        this.quantidadesPorLote = quantidadesPorLote;
    }

    public void imprimirEstoque() {
        System.out.println("Nome do Produto: " + this.nomeProduto);
        System.out.println("Quantidades por Lote:" + this.quantidadesPorLote);
    }

    public boolean verificarLoteCritico(int limiteVenda) {
        if (this.quantidadesPorLote == null) return false;
        for (int[] lote : this.quantidadesPorLote) {
            if (lote != null && lote.length > 1) {
                int vendidos = lote[1]; // supondo que índice 1 representa quantidade vendida
                if (vendidos > limiteVenda) return true;
            }
        }
        return false;
    }
}

