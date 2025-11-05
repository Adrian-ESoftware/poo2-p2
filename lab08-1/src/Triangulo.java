public class Triangulo extends Forma {
    private double base;
    private double altura;

    /**
     * Construtor do Triângulo
     * @param base a base do triângulo
     * @param altura a altura do triângulo
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void desenhar() {
        IO.println("Desenhando um triângulo com base " + base + " e altura " + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

