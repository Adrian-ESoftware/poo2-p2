public class LeitorCSV implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("[CSV] Lendo arquivo CSV: " + caminhoArquivo);
        System.out.println("[CSV] Colunas: id, nome, email");
        System.out.println("[CSV] Linha 1: 1, Alice, alice@example.com");
        System.out.println("[CSV] Linha 2: 2, Bob, bob@example.com");
    }

    @Override
    public String getFormato() {
        return "CSV";
    }
}

