public class Boleto implements MetodoPagamento {
    private String codigoBarras;
    private boolean pendente;

    public Boleto() {
        this.pendente = false;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= 0) {
            System.out.println("Pagamento inválido: o valor deve ser maior que zero.");
            return false;
        }
        // Gera um código de barras simulado e marca como pendente
        this.codigoBarras = "BOLETO-" + System.currentTimeMillis() + "-VAL" + ((long) (valor * 100));
        this.pendente = true;
        System.out.println("Boleto gerado no valor de R$" + valor + ". Código de barras: " + codigoBarras + ". Status: PENDENTE.");
        return true; // sucesso na geração do boleto (pagamento ainda pendente)
    }

    @Override
    public String getNome() {
        return "Boleto";
    }

    // Métodos auxiliares opcionais para consulta
    public String getCodigoBarras() { return codigoBarras; }
    public boolean isPendente() { return pendente; }
    public void marcarComoPago() { this.pendente = false; }
}

