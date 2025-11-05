import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe estática para operações comuns com datas e horas
 * Fornece métodos para formatação, cálculos e verificações de datas
 * Ideal para sistemas de agendamento que manipulam datas de forma consistente
 */
public class UtilitariosDataHora {

    // Formatadores predefinidos
    private static final DateTimeFormatter FORMATO_BR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATO_BR_COMPLETO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter FORMATO_ISO = DateTimeFormatter.ISO_LOCAL_DATE;
    private static final DateTimeFormatter FORMATO_ISO_COMPLETO = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    private static final DateTimeFormatter FORMATO_EXTENSO = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
    private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * Formata uma data para o padrão brasileiro (dd/MM/yyyy)
     *
     * @param data a data a ser formatada
     * @return a data formatada no padrão brasileiro
     */
    public static String formatarDataBR(LocalDate data) {
        validarData(data);
        return data.format(FORMATO_BR);
    }

    /**
     * Formata uma data e hora para o padrão brasileiro (dd/MM/yyyy HH:mm:ss)
     *
     * @param dataHora a data e hora a ser formatada
     * @return a data e hora formatada no padrão brasileiro
     */
    public static String formatarDataHoraBR(LocalDateTime dataHora) {
        validarDataHora(dataHora);
        return dataHora.format(FORMATO_BR_COMPLETO);
    }

    /**
     * Formata uma data para o padrão ISO (yyyy-MM-dd)
     *
     * @param data a data a ser formatada
     * @return a data formatada no padrão ISO
     */
    public static String formatarDataISO(LocalDate data) {
        validarData(data);
        return data.format(FORMATO_ISO);
    }

    /**
     * Formata uma data e hora para o padrão ISO (yyyy-MM-ddTHH:mm:ss)
     *
     * @param dataHora a data e hora a ser formatada
     * @return a data e hora formatada no padrão ISO
     */
    public static String formatarDataHoraISO(LocalDateTime dataHora) {
        validarDataHora(dataHora);
        return dataHora.format(FORMATO_ISO_COMPLETO);
    }

    /**
     * Formata uma data por extenso (ex: 25 de dezembro de 2024)
     *
     * @param data a data a ser formatada
     * @return a data formatada por extenso
     */
    public static String formatarDataExtenso(LocalDate data) {
        validarData(data);
        return data.format(FORMATO_EXTENSO);
    }

    /**
     * Formata uma hora para o padrão HH:mm:ss
     *
     * @param hora a hora a ser formatada
     * @return a hora formatada
     */
    public static String formatarHora(LocalTime hora) {
        if (hora == null) {
            throw new IllegalArgumentException("A hora não pode ser nula");
        }
        return hora.format(FORMATO_HORA);
    }

    /**
     * Converte uma string no formato brasileiro para LocalDate
     *
     * @param dataStr a data em formato string (dd/MM/yyyy)
     * @return a data convertida para LocalDate
     */
    public static LocalDate parseDataBR(String dataStr) {
        if (dataStr == null || dataStr.isEmpty()) {
            throw new IllegalArgumentException("A string de data não pode ser nula ou vazia");
        }
        try {
            return LocalDate.parse(dataStr, FORMATO_BR);
        } catch (Exception e) {
            throw new IllegalArgumentException("Formato de data inválido. Use dd/MM/yyyy");
        }
    }

    /**
     * Converte uma string no formato ISO para LocalDate
     *
     * @param dataStr a data em formato string (yyyy-MM-dd)
     * @return a data convertida para LocalDate
     */
    public static LocalDate parseDataISO(String dataStr) {
        if (dataStr == null || dataStr.isEmpty()) {
            throw new IllegalArgumentException("A string de data não pode ser nula ou vazia");
        }
        try {
            return LocalDate.parse(dataStr, FORMATO_ISO);
        } catch (Exception e) {
            throw new IllegalArgumentException("Formato de data inválido. Use yyyy-MM-dd");
        }
    }

    /**
     * Calcula a diferença em dias entre duas datas
     *
     * @param data1 primeira data
     * @param data2 segunda data
     * @return a diferença em dias (data2 - data1)
     */
    public static long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        validarData(data1);
        validarData(data2);
        return ChronoUnit.DAYS.between(data1, data2);
    }

    /**
     * Calcula a diferença em horas entre duas datas e horas
     *
     * @param dataHora1 primeira data e hora
     * @param dataHora2 segunda data e hora
     * @return a diferença em horas (dataHora2 - dataHora1)
     */
    public static long calcularDiferencaHoras(LocalDateTime dataHora1, LocalDateTime dataHora2) {
        validarDataHora(dataHora1);
        validarDataHora(dataHora2);
        return ChronoUnit.HOURS.between(dataHora1, dataHora2);
    }

    /**
     * Calcula a diferença em minutos entre duas datas e horas
     *
     * @param dataHora1 primeira data e hora
     * @param dataHora2 segunda data e hora
     * @return a diferença em minutos (dataHora2 - dataHora1)
     */
    public static long calcularDiferencaMinutos(LocalDateTime dataHora1, LocalDateTime dataHora2) {
        validarDataHora(dataHora1);
        validarDataHora(dataHora2);
        return ChronoUnit.MINUTES.between(dataHora1, dataHora2);
    }

    /**
     * Calcula a diferença em meses entre duas datas
     *
     * @param data1 primeira data
     * @param data2 segunda data
     * @return a diferença em meses (data2 - data1)
     */
    public static long calcularDiferencaMeses(LocalDate data1, LocalDate data2) {
        validarData(data1);
        validarData(data2);
        return ChronoUnit.MONTHS.between(data1, data2);
    }

    /**
     * Calcula a idade de uma pessoa em anos
     *
     * @param dataNascimento a data de nascimento
     * @return a idade em anos
     */
    public static int calcularIdade(LocalDate dataNascimento) {
        validarData(dataNascimento);
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de nascimento não pode ser no futuro");
        }
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

    /**
     * Verifica se um ano é bissexto
     *
     * @param ano o ano a ser verificado
     * @return true se o ano é bissexto, false caso contrário
     */
    public static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /**
     * Verifica se uma data é no fim de semana (sábado ou domingo)
     *
     * @param data a data a ser verificada
     * @return true se é fim de semana, false caso contrário
     */
    public static boolean ehFimDeSemana(LocalDate data) {
        validarData(data);
        int diaSemana = data.getDayOfWeek().getValue();
        return diaSemana >= 6; // 6 = sábado, 7 = domingo
    }

    /**
     * Verifica se uma data é feriado (fixo)
     * Considerapenas feriados federais fixos brasileiros
     *
     * @param data a data a ser verificada
     * @return true se é feriado, false caso contrário
     */
    public static boolean ehFeriado(LocalDate data) {
        validarData(data);
        int mes = data.getMonthValue();
        int dia = data.getDayOfMonth();

        // Feriados fixos brasileiros
        return (mes == 1 && dia == 1) ||   // Ano Novo
               (mes == 4 && dia == 21) ||  // Tiradentes
               (mes == 5 && dia == 1) ||   // Dia do Trabalho
               (mes == 9 && dia == 7) ||   // Independência
               (mes == 10 && dia == 12) || // Nossa Senhora Aparecida
               (mes == 11 && dia == 2) ||  // Finados
               (mes == 11 && dia == 20) || // Consciência Negra
               (mes == 12 && dia == 25);   // Natal
    }

    /**
     * Verifica se uma data é um dia útil (não é fim de semana nem feriado)
     *
     * @param data a data a ser verificada
     * @return true se é dia útil, false caso contrário
     */
    public static boolean ehDiaUtil(LocalDate data) {
        validarData(data);
        return !ehFimDeSemana(data) && !ehFeriado(data);
    }

    /**
     * Obtém o número de dias em um mês específico
     *
     * @param ano o ano
     * @param mes o mês (1-12)
     * @return o número de dias no mês
     */
    public static int obterDiasNoMes(int ano, int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês deve estar entre 1 e 12");
        }
        return YearMonth.of(ano, mes).lengthOfMonth();
    }

    /**
     * Adiciona dias a uma data
     *
     * @param data a data original
     * @param dias o número de dias a adicionar
     * @return a nova data
     */
    public static LocalDate adicionarDias(LocalDate data, long dias) {
        validarData(data);
        return data.plusDays(dias);
    }

    /**
     * Adiciona meses a uma data
     *
     * @param data a data original
     * @param meses o número de meses a adicionar
     * @return a nova data
     */
    public static LocalDate adicionarMeses(LocalDate data, long meses) {
        validarData(data);
        return data.plusMonths(meses);
    }

    /**
     * Adiciona anos a uma data
     *
     * @param data a data original
     * @param anos o número de anos a adicionar
     * @return a nova data
     */
    public static LocalDate adicionarAnos(LocalDate data, long anos) {
        validarData(data);
        return data.plusYears(anos);
    }

    /**
     * Retorna a data de hoje
     *
     * @return a data atual
     */
    public static LocalDate obterDataAtual() {
        return LocalDate.now();
    }

    /**
     * Retorna a data e hora atual
     *
     * @return a data e hora atual
     */
    public static LocalDateTime obterDataHoraAtual() {
        return LocalDateTime.now();
    }

    /**
     * Obtém o primeiro dia do mês para uma data
     *
     * @param data a data de referência
     * @return o primeiro dia do mês
     */
    public static LocalDate obterPrimeiroDiaDoMes(LocalDate data) {
        validarData(data);
        return data.withDayOfMonth(1);
    }

    /**
     * Obtém o último dia do mês para uma data
     *
     * @param data a data de referência
     * @return o último dia do mês
     */
    public static LocalDate obterUltimoDiaDoMes(LocalDate data) {
        validarData(data);
        return data.withDayOfMonth(data.lengthOfMonth());
    }

    /**
     * Calcula quantos dias úteis há entre duas datas
     *
     * @param data1 primeira data
     * @param data2 segunda data
     * @return o número de dias úteis
     */
    public static int calcularDiasUteis(LocalDate data1, LocalDate data2) {
        validarData(data1);
        validarData(data2);

        if (data1.isAfter(data2)) {
            LocalDate temp = data1;
            data1 = data2;
            data2 = temp;
        }

        int diasUteis = 0;
        LocalDate dataAtual = data1;

        while (!dataAtual.isAfter(data2)) {
            if (ehDiaUtil(dataAtual)) {
                diasUteis++;
            }
            dataAtual = dataAtual.plusDays(1);
        }

        return diasUteis;
    }

    /**
     * Lista os feriados de um ano específico
     *
     * @param ano o ano desejado
     * @return lista de datas dos feriados
     */
    public static List<LocalDate> listarFeriadosDoAno(int ano) {
        List<LocalDate> feriados = new ArrayList<>();

        feriados.add(LocalDate.of(ano, 1, 1));   // Ano Novo
        feriados.add(LocalDate.of(ano, 4, 21));  // Tiradentes
        feriados.add(LocalDate.of(ano, 5, 1));   // Dia do Trabalho
        feriados.add(LocalDate.of(ano, 9, 7));   // Independência
        feriados.add(LocalDate.of(ano, 10, 12)); // Nossa Senhora Aparecida
        feriados.add(LocalDate.of(ano, 11, 2));  // Finados
        feriados.add(LocalDate.of(ano, 11, 20)); // Consciência Negra
        feriados.add(LocalDate.of(ano, 12, 25)); // Natal

        return feriados;
    }

    /**
     * Valida se uma data é nula
     *
     * @param data a data a ser validada
     * @throws IllegalArgumentException se a data for nula
     */
    private static void validarData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("A data não pode ser nula");
        }
    }

    /**
     * Valida se uma data e hora é nula
     *
     * @param dataHora a data e hora a ser validada
     * @throws IllegalArgumentException se a data e hora forem nulas
     */
    private static void validarDataHora(LocalDateTime dataHora) {
        if (dataHora == null) {
            throw new IllegalArgumentException("A data e hora não podem ser nulas");
        }
    }

    /**
     * Exibe informações sobre uma data
     *
     * @param data a data para exibir informações
     */
    public static void exibirInformacoesDdata(LocalDate data) {
        validarData(data);
        System.out.println("=== Informações da Data ===");
        System.out.println("Data (BR): " + formatarDataBR(data));
        System.out.println("Data (ISO): " + formatarDataISO(data));
        System.out.println("Data (Extenso): " + formatarDataExtenso(data));
        System.out.println("Dia da semana: " + data.getDayOfWeek());
        System.out.println("Dia do mês: " + data.getDayOfMonth());
        System.out.println("Mês: " + data.getMonth());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Ano bissexto: " + ehAnoBissexto(data.getYear()));
        System.out.println("Fim de semana: " + ehFimDeSemana(data));
        System.out.println("Feriado: " + ehFeriado(data));
        System.out.println("Dia útil: " + ehDiaUtil(data));
        System.out.println("===========================");
    }
}
