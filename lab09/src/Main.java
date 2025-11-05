public class Main {
    public static void main(String[] args) {
        // Exibe as taxas de câmbio iniciais
        ConversorMoeda.exibirTaxas();
        System.out.println();

        // Exemplos de conversões
        double valorEmReais = 100.0;
        double valorEmDolares = 50.0;
        double valorEmEuros = 45.0;

        System.out.println("=== Conversões Iniciais ===");
        System.out.printf("%.2f BRL = %.2f USD%n", valorEmReais, ConversorMoeda.realParaDolar(valorEmReais));
        System.out.printf("%.2f BRL = %.2f EUR%n", valorEmReais, ConversorMoeda.realParaEuro(valorEmReais));
        System.out.printf("%.2f USD = %.2f BRL%n", valorEmDolares, ConversorMoeda.dolarParaReal(valorEmDolares));
        System.out.printf("%.2f USD = %.2f EUR%n", valorEmDolares, ConversorMoeda.dolarParaEuro(valorEmDolares));
        System.out.printf("%.2f EUR = %.2f BRL%n", valorEmEuros, ConversorMoeda.euroParaReal(valorEmEuros));
        System.out.printf("%.2f EUR = %.2f USD%n", valorEmEuros, ConversorMoeda.euroParaDolar(valorEmEuros));
        System.out.println();

        // Atualiza as taxas de câmbio
        System.out.println("=== Atualizando Taxas ===");
        ConversorMoeda.atualizarTaxas(0.21, 0.19, 0.93, 4.76, 5.26, 1.07);
        System.out.println("Taxas atualizadas!");
        System.out.println();

        // Exibe as novas taxas
        ConversorMoeda.exibirTaxas();
        System.out.println();

        // Exemplos de conversões com as novas taxas
        System.out.println("=== Conversões com Novas Taxas ===");
        System.out.printf("%.2f BRL = %.2f USD%n", valorEmReais, ConversorMoeda.realParaDolar(valorEmReais));
        System.out.printf("%.2f BRL = %.2f EUR%n", valorEmReais, ConversorMoeda.realParaEuro(valorEmReais));
        System.out.printf("%.2f USD = %.2f BRL%n", valorEmDolares, ConversorMoeda.dolarParaReal(valorEmDolares));
        System.out.printf("%.2f USD = %.2f EUR%n", valorEmDolares, ConversorMoeda.dolarParaEuro(valorEmDolares));
        System.out.printf("%.2f EUR = %.2f BRL%n", valorEmEuros, ConversorMoeda.euroParaReal(valorEmEuros));
        System.out.printf("%.2f EUR = %.2f USD%n", valorEmEuros, ConversorMoeda.euroParaDolar(valorEmEuros));
        System.out.println();

        // ============================================================
        // DEMONSTRAÇÃO DA CALCULADORA DE IMPOSTOS
        // ============================================================

        // Exibe as alíquotas dos impostos
        CalculadoraImpostos.exibirAliquotas();
        System.out.println();

        // Exemplos de cálculo de impostos
        double salario = 5000.0;
        double valorServico = 1500.0;
        double valorMercadoria = 2000.0;

        System.out.println("=== Cálculo de Impostos Individuais ===");
        System.out.printf("Valor base: R$ %.2f%n", salario);
        System.out.printf("IRRF (15%%): R$ %.2f%n", CalculadoraImpostos.calcularIRRF(salario));
        System.out.printf("INSS (11%%): R$ %.2f%n", CalculadoraImpostos.calcularINSS(salario));
        System.out.printf("PIS (1.65%%): R$ %.2f%n", CalculadoraImpostos.calcularPIS(salario));
        System.out.println();

        System.out.printf("Valor base: R$ %.2f%n", valorServico);
        System.out.printf("ISS (3%%): R$ %.2f%n", CalculadoraImpostos.calcularISS(valorServico));
        System.out.println();

        System.out.printf("Valor base: R$ %.2f%n", valorMercadoria);
        System.out.printf("ICMS (18%%): R$ %.2f%n", CalculadoraImpostos.calcularICMS(valorMercadoria));
        System.out.printf("COFINS (7.6%%): R$ %.2f%n", CalculadoraImpostos.calcularCOFINS(valorMercadoria));
        System.out.println();

        // Cálculos totais
        System.out.println("=== Cálculos Totais de Impostos ===");
        System.out.printf("Valor base: R$ %.2f%n", salario);
        System.out.printf("Total de impostos: R$ %.2f%n", CalculadoraImpostos.calcularTotalImpostos(salario));
        System.out.printf("Valor líquido: R$ %.2f%n", CalculadoraImpostos.calcularValorLiquido(salario));
        System.out.printf("Carga tributária: %.2f%%%n", CalculadoraImpostos.calcularCargaTributaria(salario));
        System.out.println();

        System.out.printf("Valor base: R$ %.2f%n", valorMercadoria);
        System.out.printf("Total de impostos: R$ %.2f%n", CalculadoraImpostos.calcularTotalImpostos(valorMercadoria));
        System.out.printf("Valor líquido: R$ %.2f%n", CalculadoraImpostos.calcularValorLiquido(valorMercadoria));
        System.out.printf("Carga tributária: %.2f%%%n", CalculadoraImpostos.calcularCargaTributaria(valorMercadoria));
        System.out.println();

        // ============================================================
        // DEMONSTRAÇÃO DO GERENCIADOR DE LOGS
        // ============================================================

        // Exibe a configuração inicial
        GerenciadorLog.exibirConfiguracao();
        System.out.println();

        // Registra logs no console
        System.out.println("=== Registrando Logs no Console ===");
        GerenciadorLog.configurarDestino(GerenciadorLog.DestinoLog.CONSOLE);
        GerenciadorLog.logInfo("Aplicação iniciada com sucesso");
        GerenciadorLog.logWarn("Aviso: Taxa de conversão desatualizada");
        GerenciadorLog.logError("Erro: Falha ao conectar com o banco de dados");
        System.out.println();

        // Registra logs em arquivo
        System.out.println("=== Registrando Logs em Arquivo ===");
        GerenciadorLog.configurarDestino(GerenciadorLog.DestinoLog.ARQUIVO);
        GerenciadorLog.configurarCaminhoArquivo("logs/aplicacao.log");
        GerenciadorLog.logInfo("Iniciando processamento de transações financeiras");
        GerenciadorLog.logWarn("Valor de imposto acima do esperado");
        GerenciadorLog.logError("Falha ao calcular conversão de moeda");
        System.out.println("Logs foram registrados no arquivo logs/aplicacao.log");
        System.out.println();

        // Registra logs em ambos (console e arquivo)
        System.out.println("=== Registrando Logs em Console e Arquivo ===");
        GerenciadorLog.configurarDestino(GerenciadorLog.DestinoLog.AMBOS);
        GerenciadorLog.configurarNivelMinimo(GerenciadorLog.NivelLog.INFO);
        GerenciadorLog.logInfo("Sistema pronto para operação");
        GerenciadorLog.logWarn("Memória disponível baixa");
        GerenciadorLog.logError("Erro crítico no processamento");
        System.out.println();

        // Registra erro com exceção
        System.out.println("=== Registrando Erro com Exceção ===");
        try {
            // Simula uma exceção
            double resultado = 100.0 / 0;
        } catch (ArithmeticException e) {
            GerenciadorLog.logError("Operação matemática inválida", e);
        }
        System.out.println();

        // Demonstra filtro de nível mínimo
        System.out.println("=== Testando Filtro de Nível Mínimo ===");
        GerenciadorLog.configurarDestino(GerenciadorLog.DestinoLog.CONSOLE);
        GerenciadorLog.configurarNivelMinimo(GerenciadorLog.NivelLog.WARN);
        System.out.println("Nível mínimo alterado para WARN (INFO será ignorado):");
        GerenciadorLog.logInfo("Esta mensagem NÃO será exibida");
        GerenciadorLog.logWarn("Esta mensagem será exibida");
        GerenciadorLog.logError("Esta mensagem será exibida");
        System.out.println();

        // Exibe configuração final
        GerenciadorLog.exibirConfiguracao();
        System.out.println();

        // ============================================================
        // DEMONSTRAÇÃO DOS UTILITÁRIOS DE DATA E HORA
        // ============================================================

        System.out.println("=== Formatação de Datas ===");
        java.time.LocalDate dataAtual = UtilitariosDataHora.obterDataAtual();
        java.time.LocalDate dataNatal2024 = java.time.LocalDate.of(2024, 12, 25);
        java.time.LocalDate dataAnoNovo2025 = java.time.LocalDate.of(2025, 1, 1);

        System.out.println("Data atual (BR): " + UtilitariosDataHora.formatarDataBR(dataAtual));
        System.out.println("Data atual (ISO): " + UtilitariosDataHora.formatarDataISO(dataAtual));
        System.out.println("Data atual (Extenso): " + UtilitariosDataHora.formatarDataExtenso(dataAtual));
        System.out.println();

        System.out.println("Natal 2024 (BR): " + UtilitariosDataHora.formatarDataBR(dataNatal2024));
        System.out.println("Natal 2024 (Extenso): " + UtilitariosDataHora.formatarDataExtenso(dataNatal2024));
        System.out.println();

        // Demonstra parsing
        System.out.println("=== Conversão de String para Data ===");
        java.time.LocalDate dataParseBR = UtilitariosDataHora.parseDataBR("15/03/1990");
        System.out.println("String '15/03/1990' convertida para: " + UtilitariosDataHora.formatarDataISO(dataParseBR));
        System.out.println();

        // Cálculos de diferença entre datas
        System.out.println("=== Cálculos de Diferença entre Datas ===");
        long diasParaNatal = UtilitariosDataHora.calcularDiferencaDias(dataAtual, dataNatal2024);
        long diasParaAnoNovo = UtilitariosDataHora.calcularDiferencaDias(dataAtual, dataAnoNovo2025);
        System.out.printf("Dias até Natal 2024: %d%n", diasParaNatal);
        System.out.printf("Dias até Ano Novo 2025: %d%n", diasParaAnoNovo);
        System.out.println();

        // Calcula idade
        System.out.println("=== Cálculo de Idade ===");
        java.time.LocalDate dataNascimento = UtilitariosDataHora.parseDataBR("15/03/1990");
        int idade = UtilitariosDataHora.calcularIdade(dataNascimento);
        System.out.println("Data de nascimento: " + UtilitariosDataHora.formatarDataBR(dataNascimento));
        System.out.println("Idade: " + idade + " anos");
        System.out.println();

        // Verifica propriedades de datas
        System.out.println("=== Verificação de Propriedades de Datas ===");
        System.out.println("Ano 2024 é bissexto: " + UtilitariosDataHora.ehAnoBissexto(2024));
        System.out.println("Ano 2025 é bissexto: " + UtilitariosDataHora.ehAnoBissexto(2025));
        System.out.println();

        System.out.println("Natal 2024 (25/12) é fim de semana: " + UtilitariosDataHora.ehFimDeSemana(dataNatal2024));
        System.out.println("Natal 2024 (25/12) é feriado: " + UtilitariosDataHora.ehFeriado(dataNatal2024));
        System.out.println("Natal 2024 (25/12) é dia útil: " + UtilitariosDataHora.ehDiaUtil(dataNatal2024));
        System.out.println();

        // Operações com datas
        System.out.println("=== Operações com Datas ===");
        java.time.LocalDate dataPlusDias = UtilitariosDataHora.adicionarDias(dataAtual, 30);
        java.time.LocalDate dataPlusMeses = UtilitariosDataHora.adicionarMeses(dataAtual, 3);
        java.time.LocalDate dataPlusAnos = UtilitariosDataHora.adicionarAnos(dataAtual, 1);

        System.out.println("Data atual: " + UtilitariosDataHora.formatarDataBR(dataAtual));
        System.out.println("+ 30 dias: " + UtilitariosDataHora.formatarDataBR(dataPlusDias));
        System.out.println("+ 3 meses: " + UtilitariosDataHora.formatarDataBR(dataPlusMeses));
        System.out.println("+ 1 ano: " + UtilitariosDataHora.formatarDataBR(dataPlusAnos));
        System.out.println();

        // Dias úteis
        System.out.println("=== Cálculo de Dias Úteis ===");
        java.time.LocalDate dataInicio = UtilitariosDataHora.parseDataBR("04/11/2024");
        java.time.LocalDate dataFim = UtilitariosDataHora.parseDataBR("15/11/2024");
        int diasUteis = UtilitariosDataHora.calcularDiasUteis(dataInicio, dataFim);
        System.out.printf("Dias úteis entre %s e %s: %d%n",
            UtilitariosDataHora.formatarDataBR(dataInicio),
            UtilitariosDataHora.formatarDataBR(dataFim),
            diasUteis);
        System.out.println();

        // Lista feriados
        System.out.println("=== Feriados de 2025 ===");
        java.util.List<java.time.LocalDate> feriados = UtilitariosDataHora.listarFeriadosDoAno(2025);
        for (java.time.LocalDate feriado : feriados) {
            System.out.println("  " + UtilitariosDataHora.formatarDataExtenso(feriado));
        }
        System.out.println();

        // Informações completas de uma data
        System.out.println("=== Informações Completas de uma Data ===");
        UtilitariosDataHora.exibirInformacoesDdata(dataNatal2024);
    }
}
