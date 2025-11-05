public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double precoDiaria, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}

