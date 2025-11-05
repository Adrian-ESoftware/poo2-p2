public class Mouse implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("Mouse conectado ao computador.");
    }

    @Override
    public void desconectar() {
        System.out.println("Mouse desconectado do computador.");
    }

    @Override
    public String getTipo() {
        return "Mouse";
    }
}

