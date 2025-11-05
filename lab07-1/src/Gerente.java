public class Gerente extends Funcionario {
    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (getSalarioBase() * bonificacaoPercentual / 100);
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonificacaoPercentual() {
        return bonificacaoPercentual;
    }
}
