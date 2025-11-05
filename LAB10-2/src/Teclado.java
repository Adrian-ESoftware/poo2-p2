public class Teclado implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Teclado conectado ao computador.");
    }

    @Override
    public void desconectar() {
        System.out.println("Teclado desconectado do computador.");
    }

    @Override
    public String getTipo() {
        return "Teclado";
    }
}

