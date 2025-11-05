import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe estática para gerenciamento de logs
 * Permite registrar mensagens em diferentes níveis (INFO, WARN, ERROR)
 * com opção de destino em console ou arquivo
 */
public class GerenciadorLog {

    // Enumeração para os níveis de log
    public enum NivelLog {
        INFO("INFO"),
        WARN("WARN"),
        ERROR("ERROR");

        private final String label;

        NivelLog(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    // Enumeração para o destino do log
    public enum DestinoLog {
        CONSOLE,
        ARQUIVO,
        AMBOS
    }

    // Atributos estáticos
    private static DestinoLog destino = DestinoLog.CONSOLE;
    private static String caminhoArquivo = "log.txt";
    private static NivelLog nivelMinimo = NivelLog.INFO;
    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final String SEPARADOR = " | ";

    /**
     * Configura o destino dos logs
     *
     * @param novoDestino o novo destino (CONSOLE, ARQUIVO, AMBOS)
     */
    public static void configurarDestino(DestinoLog novoDestino) {
        destino = novoDestino;
    }

    /**
     * Configura o caminho do arquivo de log
     *
     * @param novoCaminho o novo caminho do arquivo
     */
    public static void configurarCaminhoArquivo(String novoCaminho) {
        caminhoArquivo = novoCaminho;
    }

    /**
     * Configura o nível mínimo de log a ser registrado
     *
     * @param novoNivel o novo nível mínimo
     */
    public static void configurarNivelMinimo(NivelLog novoNivel) {
        nivelMinimo = novoNivel;
    }

    /**
     * Registra uma mensagem de log no nível INFO
     *
     * @param mensagem a mensagem a ser registrada
     */
    public static void logInfo(String mensagem) {
        registrarLog(NivelLog.INFO, mensagem);
    }

    /**
     * Registra uma mensagem de log no nível WARN
     *
     * @param mensagem a mensagem a ser registrada
     */
    public static void logWarn(String mensagem) {
        registrarLog(NivelLog.WARN, mensagem);
    }

    /**
     * Registra uma mensagem de log no nível ERROR
     *
     * @param mensagem a mensagem a ser registrada
     */
    public static void logError(String mensagem) {
        registrarLog(NivelLog.ERROR, mensagem);
    }

    /**
     * Registra uma mensagem de log no nível ERROR com exceção
     *
     * @param mensagem a mensagem a ser registrada
     * @param excecao a exceção a ser registrada
     */
    public static void logError(String mensagem, Throwable excecao) {
        String mensagemCompleta = mensagem + " - Exceção: " + excecao.getMessage();
        registrarLog(NivelLog.ERROR, mensagemCompleta);
    }

    /**
     * Método interno para registrar o log
     *
     * @param nivel o nível do log
     * @param mensagem a mensagem a ser registrada
     */
    private static void registrarLog(NivelLog nivel, String mensagem) {
        // Verifica se o nível de log está acima do mínimo configurado
        if (!podeRegistrar(nivel)) {
            return;
        }

        // Formata a mensagem de log
        String mensagemFormatada = formatarMensagem(nivel, mensagem);

        // Registra no console se configurado
        if (destino == DestinoLog.CONSOLE || destino == DestinoLog.AMBOS) {
            exibirNoConsole(nivel, mensagemFormatada);
        }

        // Registra no arquivo se configurado
        if (destino == DestinoLog.ARQUIVO || destino == DestinoLog.AMBOS) {
            escreverNoArquivo(mensagemFormatada);
        }
    }

    /**
     * Verifica se o nível de log pode ser registrado
     *
     * @param nivel o nível a ser verificado
     * @return true se o nível é igual ou superior ao nível mínimo
     */
    private static boolean podeRegistrar(NivelLog nivel) {
        return nivel.ordinal() >= nivelMinimo.ordinal();
    }

    /**
     * Formata a mensagem de log com timestamp e nível
     *
     * @param nivel o nível do log
     * @param mensagem a mensagem original
     * @return a mensagem formatada
     */
    private static String formatarMensagem(NivelLog nivel, String mensagem) {
        LocalDateTime agora = LocalDateTime.now();
        String timestamp = agora.format(formatador);
        return timestamp + SEPARADOR + "[" + nivel.getLabel() + "]" + SEPARADOR + mensagem;
    }

    /**
     * Exibe a mensagem de log no console
     *
     * @param nivel o nível do log
     * @param mensagem a mensagem formatada
     */
    private static void exibirNoConsole(NivelLog nivel, String mensagem) {
        switch (nivel) {
            case INFO:
                System.out.println(mensagem);
                break;
            case WARN:
                System.err.println(mensagem);
                break;
            case ERROR:
                System.err.println(mensagem);
                break;
        }
    }

    /**
     * Escreve a mensagem de log em um arquivo
     *
     * @param mensagem a mensagem formatada
     */
    private static void escreverNoArquivo(String mensagem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }

    /**
     * Exibe as configurações atuais do gerenciador de logs
     */
    public static void exibirConfiguracao() {
        System.out.println("=== Configuração do Gerenciador de Logs ===");
        System.out.println("Destino: " + destino);
        System.out.println("Caminho do arquivo: " + caminhoArquivo);
        System.out.println("Nível mínimo: " + nivelMinimo);
        System.out.println("=========================================");
    }
}
