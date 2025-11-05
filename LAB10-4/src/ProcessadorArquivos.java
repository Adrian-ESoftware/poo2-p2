public class ProcessadorArquivos {
    public void processar(LeitorArquivo leitor, String caminho) {
        System.out.println("Processando arquivo: " + caminho + " | Formato: " + leitor.getFormato());
        leitor.lerArquivo(caminho);
    }
}

