//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("===== ELETRÔNICO =====");
    Eletronico eletronico = new Eletronico("Notebook", 3500.00, "123456789", "Dell", "110V");
    eletronico.exibirDetalhes();

    System.out.println("\n===== LIVRO =====");
    Livro livro = new Livro("Clean Code", 89.90, "987654321", "Robert C. Martin", "978-0132350884");
    livro.exibirDetalhes();

    System.out.println("\n===== ROUPA =====");
    Roupa roupa = new Roupa("Camiseta", 49.90, "555666777", "M", "Algodão");
    roupa.exibirDetalhes();
}
