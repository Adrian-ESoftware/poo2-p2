import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    IO.println();

    // Criar um ArrayList de Forma para armazenar diferentes tipos de formas
    ArrayList<Forma> formas = new ArrayList<>();

    // Adicionar instâncias de diferentes formas ao ArrayList
    formas.add(new Circulo(5.0));
    formas.add(new Quadrado(4.0));
    formas.add(new Triangulo(6.0, 8.0));
    formas.add(new Circulo(3.0));
    formas.add(new Quadrado(5.0));

    IO.println("=== Sistema de Formas Geométricas ===");
    IO.println();

    double areaTotal = 0;

    // Iterar sobre o ArrayList, chamando os métodos calcularArea() e desenhar()
    // Demonstrando polimorfismo: cada forma executa seu próprio método
    for (Forma forma : formas) {
        forma.desenhar();
        double area = forma.calcularArea();
        IO.println(String.format("Área: %.2f unidades²", area));
        IO.println();
        areaTotal += area;
    }

    IO.println("=== Resumo ===");
    IO.println(String.format("Total de formas: %d", formas.size()));
    IO.println(String.format("Área total: %.2f unidades²", areaTotal));
}
