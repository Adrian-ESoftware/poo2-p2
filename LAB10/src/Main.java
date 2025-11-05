public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        MetodoPagamento cartao = new CartaoCredito("João da Silva", "4111111111111111", "12/28", "123");
        MetodoPagamento paypal = new PayPal("joao@example.com", "segredo123");
        MetodoPagamento boleto = new Boleto();

        loja.processarCompra(150.0, cartao);
        loja.processarCompra(200.0, paypal);
        loja.processarCompra(350.0, boleto);
    }
}