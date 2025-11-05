//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IO.println("=== Sistema de Pagamento ===\n");

    // Criando instâncias de diferentes métodos de pagamento
    CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", "João Silva", "12/26");
    Boleto boleto = new Boleto("12345.67890 12345.678901 12345.678901 1 12345678901234", "15/12/2025");
    Pix pix = new Pix("joao@email.com");

    // Testando polimorfismo com diferentes métodos de pagamento
    IO.println("\n--- Pagamento 1: Cartão de Crédito ---");
    realizarPagamento(cartao, 150.50);

    IO.println("\n--- Pagamento 2: Boleto ---");
    realizarPagamento(boleto, 250.00);

    IO.println("\n--- Pagamento 3: Pix ---");
    realizarPagamento(pix, 99.99);

    IO.println("\n--- Pagamento 4: Teste com valor negativo (Cartão) ---");
    realizarPagamento(cartao, -50.00);

    IO.println("\n--- Pagamento 5: Outro Pix ---");
    Pix pix2 = new Pix("chave-aleatoria-123");
    realizarPagamento(pix2, 500.00);

    IO.println("\n=== Fim do sistema ===");
}

// Método que demonstra o polimorfismo
void realizarPagamento(MetodoPagamento metodo, double valor) {
    IO.println("Processando pagamento de R$ " + String.format("%.2f", valor) + "...");
    if (metodo.processarPagamento(valor)) {
        IO.println("✓ Pagamento realizado com sucesso!\n");
    } else {
        IO.println("✗ Pagamento falhou!\n");
    }
}
