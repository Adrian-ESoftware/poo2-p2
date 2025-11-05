public class LojaVirtual {
    public void processarCompra(double valor, MetodoPagamento metodo) {
        System.out.println("Processando compra de R$" + valor + " com " + metodo.getNome() + "...");
        boolean sucesso = metodo.pagar(valor);
        if (sucesso) {
            System.out.println("Compra concluída com sucesso usando " + metodo.getNome() + ".");
        } else {
            System.out.println("Falha ao processar a compra com " + metodo.getNome() + ".");
        }
        System.out.println();
    }
}

