//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "123456789", 3000);
        Gerente gerente = new Gerente("Maria", "987654321", 5000, "Vendas", 20);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", "456789123", 4000, "Java", 1000);

        System.out.println("Funcionário: " + funcionario.getNome() + ", Salário Total: " + funcionario.calcularSalarioTotal());
        System.out.println("Gerente: " + gerente.getNome() + ", Salário Total: " + gerente.calcularSalarioTotal());
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome() + ", Salário Total: " + desenvolvedor.calcularSalarioTotal());
    }
}
