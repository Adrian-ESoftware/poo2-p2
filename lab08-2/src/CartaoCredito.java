public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            IO.println("Pagamento com cartão de crédito processado.");
            IO.println("Cartão: " + numeroCartao + " | Titular: " + nomeTitular + " | Validade: " + validade);
            IO.println("Valor: R$ " + valor);
            return true;
        } else {
            IO.println("Erro: Valor inválido para pagamento com cartão.");
            return false;
        }
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getValidade() {
        return validade;
    }
}

