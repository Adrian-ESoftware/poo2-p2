public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;

    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            IO.println("Pagamento com boleto gerado. Pague até " + dataVencimento + ".");
            IO.println("Código de Barra: " + codigoBarra);
            return true;
        }
        IO.println("Erro: Valor inválido para pagamento com boleto.");
        return false;
    }

    // Getters
    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
}

