/**
 * Classe estática para cálculo de impostos
 * Contém métodos para calcular diferentes tipos de impostos (IRRF, ICMS, ISS)
 * As alíquotas são armazenadas como constantes estáticas
 */
public class CalculadoraImpostos {

    // Constantes estáticas para as alíquotas dos impostos

    /**
     * Alíquota do IRRF (Imposto de Renda Retido na Fonte)
     * Para simplificação, usamos uma alíquota média de 15%
     */
    public static final double ALIQUOTA_IRRF = 0.15;

    /**
     * Alíquota do ICMS (Imposto sobre Circulação de Mercadorias e Serviços)
     * Varia por estado, aqui usamos 18% como exemplo
     */
    public static final double ALIQUOTA_ICMS = 0.18;

    /**
     * Alíquota do ISS (Imposto sobre Serviços de Qualquer Natureza)
     * Normalmente de 2% a 5%, usamos 3% como exemplo
     */
    public static final double ALIQUOTA_ISS = 0.03;

    /**
     * Alíquota do INSS (Contribuição para o INSS)
     * Para pessoa física, é de aproximadamente 8% a 11%, usamos 11%
     */
    public static final double ALIQUOTA_INSS = 0.11;

    /**
     * Alíquota do PIS (Programa de Integração Social)
     * Aproximadamente 1,65%
     */
    public static final double ALIQUOTA_PIS = 0.0165;

    /**
     * Alíquota do COFINS (Contribuição para Financiamento da Seguridade Social)
     * Aproximadamente 7,6%
     */
    public static final double ALIQUOTA_COFINS = 0.076;

    /**
     * Calcula o valor do IRRF (Imposto de Renda Retido na Fonte)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do IRRF calculado
     */
    public static double calcularIRRF(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_IRRF;
    }

    /**
     * Calcula o valor do ICMS (Imposto sobre Circulação de Mercadorias e Serviços)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do ICMS calculado
     */
    public static double calcularICMS(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_ICMS;
    }

    /**
     * Calcula o valor do ISS (Imposto sobre Serviços de Qualquer Natureza)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do ISS calculado
     */
    public static double calcularISS(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_ISS;
    }

    /**
     * Calcula o valor do INSS (Contribuição para o INSS)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do INSS calculado
     */
    public static double calcularINSS(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_INSS;
    }

    /**
     * Calcula o valor do PIS (Programa de Integração Social)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do PIS calculado
     */
    public static double calcularPIS(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_PIS;
    }

    /**
     * Calcula o valor do COFINS (Contribuição para Financiamento da Seguridade Social)
     *
     * @param valorBase o valor base para cálculo do imposto
     * @return o valor do COFINS calculado
     */
    public static double calcularCOFINS(double valorBase) {
        validarValor(valorBase);
        return valorBase * ALIQUOTA_COFINS;
    }

    /**
     * Calcula o total de impostos para um valor base
     * Inclui: IRRF, ICMS, ISS, INSS, PIS, COFINS
     *
     * @param valorBase o valor base para cálculo dos impostos
     * @return o total de todos os impostos calculados
     */
    public static double calcularTotalImpostos(double valorBase) {
        validarValor(valorBase);
        return calcularIRRF(valorBase) +
               calcularICMS(valorBase) +
               calcularISS(valorBase) +
               calcularINSS(valorBase) +
               calcularPIS(valorBase) +
               calcularCOFINS(valorBase);
    }

    /**
     * Calcula o valor líquido após dedução de todos os impostos
     *
     * @param valorBase o valor base
     * @return o valor líquido (valor base - total de impostos)
     */
    public static double calcularValorLiquido(double valorBase) {
        validarValor(valorBase);
        return valorBase - calcularTotalImpostos(valorBase);
    }

    /**
     * Calcula a carga tributária total em percentual
     *
     * @param valorBase o valor base
     * @return a carga tributária em percentual
     */
    public static double calcularCargaTributaria(double valorBase) {
        validarValor(valorBase);
        return (calcularTotalImpostos(valorBase) / valorBase) * 100;
    }

    /**
     * Valida se o valor é positivo
     *
     * @param valor o valor a ser validado
     * @throws IllegalArgumentException se o valor for menor ou igual a zero
     */
    private static void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }
    }

    /**
     * Exibe as alíquotas dos impostos cadastradas na classe
     */
    public static void exibirAliquotas() {
        System.out.println("=== Alíquotas de Impostos ===");
        System.out.printf("IRRF: %.2f%%%n", ALIQUOTA_IRRF * 100);
        System.out.printf("ICMS: %.2f%%%n", ALIQUOTA_ICMS * 100);
        System.out.printf("ISS: %.2f%%%n", ALIQUOTA_ISS * 100);
        System.out.printf("INSS: %.2f%%%n", ALIQUOTA_INSS * 100);
        System.out.printf("PIS: %.2f%%%n", ALIQUOTA_PIS * 100);
        System.out.printf("COFINS: %.2f%%%n", ALIQUOTA_COFINS * 100);
        System.out.println("============================");
    }
}
