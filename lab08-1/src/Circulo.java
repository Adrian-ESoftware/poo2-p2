public class Circulo extends Forma {
    private double raio;

    /**
     * Construtor do Círculo
     * @param raio o raio do círculo
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        IO.println("Desenhando um círculo com raio " + raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

