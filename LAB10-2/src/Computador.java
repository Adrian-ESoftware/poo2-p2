public class Computador {
    public void conectarDispositivo(DispositivoConectavel dispositivo) {
        dispositivo.conectar();
        System.out.println(dispositivo.getTipo() + " foi conectado.");
    }

    public void desconectarDispositivo(DispositivoConectavel dispositivo) {
        dispositivo.desconectar();
        System.out.println(dispositivo.getTipo() + " foi desconectado.");
    }
}

