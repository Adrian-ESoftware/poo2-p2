//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar instância de Carro
        Carro carro = new Carro("Toyota", "Corolla", 2023, 150.0, 4, "Gasolina");

        // Criar instância de Moto
        Moto moto = new Moto("Honda", "CB 500", 2022, 80.0, 500, "Elétrica");

        // Demonstrar cálculo do custo de locação para o Carro
        System.out.println("=== CARRO ===");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Portas: " + carro.getNumeroPortas());
        System.out.println("Combustível: " + carro.getTipoCombustivel());
        System.out.println("Preço diária: R$ " + carro.getPrecoDiaria());
        System.out.println("Custo para 3 dias: R$ " + carro.calcularCustoLocacao(3));
        System.out.println("Custo para 7 dias: R$ " + carro.calcularCustoLocacao(7));
        System.out.println("Custo para 15 dias: R$ " + carro.calcularCustoLocacao(15));

        System.out.println("\n=== MOTO ===");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindrada: " + moto.getCilindrada() + "cc");
        System.out.println("Tipo de Partida: " + moto.getTipoPartida());
        System.out.println("Preço diária: R$ " + moto.getPrecoDiaria());
        System.out.println("Custo para 3 dias: R$ " + moto.calcularCustoLocacao(3));
        System.out.println("Custo para 7 dias: R$ " + moto.calcularCustoLocacao(7));
        System.out.println("Custo para 15 dias: R$ " + moto.calcularCustoLocacao(15));
    }
}
