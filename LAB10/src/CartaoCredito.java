public class CartaoCredito implements MetodoPagamento {
    private String nomeTitular;
    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;
    private double limiteDisponivel = 1000.0;

    public CartaoCredito(String nomeTitular, String numeroCartao, String dataValidade, String codigoSeguranca) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public boolean pagar(double valor) {
        // Verificação simulada de limite e débito do valor
        if (valor <= 0) {
            System.out.println("Pagamento inválido: o valor deve ser maior que zero.");
            return false;
        }
        if (valor > limiteDisponivel) {
            System.out.println("Pagamento recusado: limite insuficiente. Limite disponível: R$" + limiteDisponivel);
            return false;
        }
        limiteDisponivel -= valor;
        System.out.println("Pagamento de R$" + valor + " aprovado no cartão de crédito. Novo limite disponível: R$" + limiteDisponivel);
        return true;
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }

}
