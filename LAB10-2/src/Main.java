public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();

        DispositivoConectavel teclado = new Teclado();
        DispositivoConectavel mouse = new Mouse();
        DispositivoConectavel impressora = new Impressora();

        pc.conectarDispositivo(teclado);
        pc.conectarDispositivo(mouse);
        pc.conectarDispositivo(impressora);

        pc.desconectarDispositivo(teclado);
        pc.desconectarDispositivo(mouse);
        pc.desconectarDispositivo(impressora);
    }
}