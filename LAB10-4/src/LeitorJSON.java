public class LeitorJSON implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("[JSON] Lendo arquivo JSON: " + caminhoArquivo);
        System.out.println("[JSON] Parsing simulado: { \"id\": 1, \"nome\": \"Alice\" }");
        System.out.println("[JSON] Campos extraídos: id=1, nome=Alice");
    }

    @Override
    public String getFormato() {
        return "JSON";
    }
}

