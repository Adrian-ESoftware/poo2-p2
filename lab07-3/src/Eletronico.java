class Eletronico extends Produto {
    private String marca;
    private String voltagem;

    public Eletronico(String nome, double preco, String codigoBarras, String marca, String voltagem) {
        super(nome, preco, codigoBarras);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem);
    }
}

