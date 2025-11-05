public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            IO.println("Pagamento com Pix realizado para a chave " + chavePix + ".");
            return true;
        }
        IO.println("Erro: Valor inválido para pagamento com Pix.");
        return false;
    }

    // Getter
    public String getChavePix() {
        return chavePix;
    }
}

