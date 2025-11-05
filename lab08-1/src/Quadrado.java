public class Quadrado extends Forma {
    private double lado;

    /**
     * Construtor do Quadrado
     * @param lado o lado do quadrado
     */
    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void desenhar() {
        IO.println("Desenhando um quadrado com lado " + lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

