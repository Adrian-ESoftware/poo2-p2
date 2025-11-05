public class Impressora implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Impressora conectada ao computador.");
    }

    @Override
    public void desconectar() {
        System.out.println("Impressora desconectada do computador.");
    }

    @Override
    public String getTipo() {
        return "Impressora";
    }
}

