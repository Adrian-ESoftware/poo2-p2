import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar ArrayList de Funcionario
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionar instâncias de diferentes tipos de funcionários
        funcionarios.add(new Gerente("Carlos Silva", "G001", 5000.00, 1500.00));
        funcionarios.add(new Desenvolvedor("Ana Costa", "D001", 4000.00, 5, "Java"));
        funcionarios.add(new Desenvolvedor("Bruno Santos", "D002", 3500.00, 2, "Python"));
        funcionarios.add(new Estagiario("Maria Oliveira", "E001", 1500.00));

        // Iterar sobre o ArrayList e exibir informações
        System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===\n");

        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.getNome());
            System.out.println("Matrícula: " + func.getMatricula());
            System.out.println("Salário: R$ " + String.format("%.2f", func.calcularSalario()));
            func.realizarTarefa();
            System.out.println();
        }

        // Exibir resumo de custos
        double totalSalarios = 0;
        for (Funcionario func : funcionarios) {
            totalSalarios += func.calcularSalario();
        }

        System.out.println("=== RESUMO ===");
        System.out.println("Total de funcionários: " + funcionarios.size());
        System.out.println("Total de salários: R$ " + String.format("%.2f", totalSalarios));
    }
}

