public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;

    public Moto(String marca, String modelo, int ano, double precoDiaria, int cilindrada, String tipoPartida) {
        super(marca, modelo, ano, precoDiaria);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }
}

