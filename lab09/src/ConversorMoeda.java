public class ConversorMoeda {
    // Atributos estáticos para armazenar as taxas de câmbio
    private static double realParaDolar = 0.20;
    private static double realParaEuro = 0.18;
    private static double dolarParaEuro = 0.92;
    private static double dolarParaReal = 5.00;
    private static double euroParaReal = 5.56;
    private static double euroParaDolar = 1.09;

    /**
     * Converte Real para Dólar
     * @param valor o valor em reais
     * @return o valor convertido em dólares
     */
    public static double realParaDolar(double valor) {
        return valor * realParaDolar;
    }

    /**
     * Converte Real para Euro
     * @param valor o valor em reais
     * @return o valor convertido em euros
     */
    public static double realParaEuro(double valor) {
        return valor * realParaEuro;
    }

    /**
     * Converte Dólar para Real
     * @param valor o valor em dólares
     * @return o valor convertido em reais
     */
    public static double dolarParaReal(double valor) {
        return valor * dolarParaReal;
    }

    /**
     * Converte Dólar para Euro
     * @param valor o valor em dólares
     * @return o valor convertido em euros
     */
    public static double dolarParaEuro(double valor) {
        return valor * dolarParaEuro;
    }

    /**
     * Converte Euro para Real
     * @param valor o valor em euros
     * @return o valor convertido em reais
     */
    public static double euroParaReal(double valor) {
        return valor * euroParaReal;
    }

    /**
     * Converte Euro para Dólar
     * @param valor o valor em euros
     * @return o valor convertido em dólares
     */
    public static double euroParaDolar(double valor) {
        return valor * euroParaDolar;
    }

    /**
     * Atualiza as taxas de câmbio
     * @param novaRealParaDolar nova taxa de Real para Dólar
     * @param novaRealParaEuro nova taxa de Real para Euro
     * @param novoDolarParaEuro nova taxa de Dólar para Euro
     * @param novoDolarParaReal nova taxa de Dólar para Real
     * @param novoEuroParaReal nova taxa de Euro para Real
     * @param novoEuroParaDolar nova taxa de Euro para Dólar
     */
    public static void atualizarTaxas(double novaRealParaDolar, double novaRealParaEuro,
                                      double novoDolarParaEuro, double novoDolarParaReal,
                                      double novoEuroParaReal, double novoEuroParaDolar) {
        realParaDolar = novaRealParaDolar;
        realParaEuro = novaRealParaEuro;
        dolarParaEuro = novoDolarParaEuro;
        dolarParaReal = novoDolarParaReal;
        euroParaReal = novoEuroParaReal;
        euroParaDolar = novoEuroParaDolar;
    }

    /**
     * Exibe as taxas de câmbio atuais
     */
    public static void exibirTaxas() {
        System.out.println("=== Taxas de Câmbio Atuais ===");
        System.out.println("Real para Dólar: " + realParaDolar);
        System.out.println("Real para Euro: " + realParaEuro);
        System.out.println("Dólar para Real: " + dolarParaReal);
        System.out.println("Dólar para Euro: " + dolarParaEuro);
        System.out.println("Euro para Real: " + euroParaReal);
        System.out.println("Euro para Dólar: " + euroParaDolar);
        System.out.println("==============================");
    }
}
