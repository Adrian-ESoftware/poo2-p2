public class Main {
    public static void main(String[] args) {
        ProcessadorArquivos processador = new ProcessadorArquivos();

        LeitorArquivo leitorTxt = new LeitorTXT();
        LeitorArquivo leitorCsv = new LeitorCSV();
        LeitorArquivo leitorJson = new LeitorJSON();

        processador.processar(leitorTxt, "dados/exemplo.txt");
        processador.processar(leitorCsv, "dados/contatos.csv");
        processador.processar(leitorJson, "dados/usuario.json");
    }
}