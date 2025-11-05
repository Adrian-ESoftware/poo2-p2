public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, String matricula, double bolsaAuxilio) {
        super(nome, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Estagiário " + nome + " está aprendendo e auxiliando.");
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
}

