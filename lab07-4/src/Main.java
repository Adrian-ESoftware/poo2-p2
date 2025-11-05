//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar instância de Circulo
        Circulo circulo = new Circulo(5);
        System.out.println("=== CÍRCULO ===");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", circulo.calcularPerimetro()));
        System.out.println();

        // Criar instância de Retangulo
        Retangulo retangulo = new Retangulo(4, 6);
        System.out.println("=== RETÂNGULO ===");
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + String.format("%.2f", retangulo.calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", retangulo.calcularPerimetro()));
        System.out.println();

        // Criar instância de Triangulo
        Triangulo triangulo = new Triangulo(8, 5, 5, 5, 8);
        System.out.println("=== TRIÂNGULO ===");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Lados: " + triangulo.getLado1() + ", " + triangulo.getLado2() + ", " + triangulo.getLado3());
        System.out.println("Área: " + String.format("%.2f", triangulo.calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", triangulo.calcularPerimetro()));
    }
}
