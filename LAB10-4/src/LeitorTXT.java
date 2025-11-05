public class LeitorTXT implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("[TXT] Lendo arquivo de texto: " + caminhoArquivo);
        System.out.println("[TXT] Conteúdo simulado: linha 1, linha 2, linha 3...");
    }

    @Override
    public String getFormato() {
        return "TXT";
    }
}

