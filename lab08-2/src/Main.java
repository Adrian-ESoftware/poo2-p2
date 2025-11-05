//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IO.println("=== Sistema de Pagamento ===\n");

    // Criando instâncias de diferentes métodos de pagamento
    CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", "João Silva", "12/25");
    Boleto boleto = new Boleto("12345.67890 12345.678901 12345.678901 1 12345678901234", "10/12/2025");
    Pix pix = new Pix("joao@example.com");

    // Testando pagamentos com diferentes métodos
    IO.println("--- Pagamento 1: Cartão de Crédito ---");
    realizarPagamento(cartao, 150.00);

    IO.println("\n--- Pagamento 2: Boleto ---");
    realizarPagamento(boleto, 200.50);

    IO.println("\n--- Pagamento 3: Pix ---");
    realizarPagamento(pix, 75.99);

    IO.println("\n--- Pagamento 4: Cartão de Crédito (Valor Inválido) ---");
    realizarPagamento(cartao, -50.00);
}

static void realizarPagamento(MetodoPagamento metodo, double valor) {
    boolean sucesso = metodo.processarPagamento(valor);
    if (sucesso) {
        IO.println("✓ Transação realizada com sucesso!\n");
    } else {
        IO.println("✗ Transação falhou!\n");
    }
}
