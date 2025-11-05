public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + bonusPorProjeto;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public double getBonusPorProjeto() {
        return bonusPorProjeto;
    }
}
