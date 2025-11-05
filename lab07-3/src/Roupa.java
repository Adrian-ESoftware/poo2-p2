class Roupa extends Produto {
    private String tamanho;
    private String material;

    public Roupa(String nome, double preco, String codigoBarras, String tamanho, String material) {
        super(nome, preco, codigoBarras);
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}

