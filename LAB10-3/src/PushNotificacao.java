public class PushNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando Push: " + mensagem);
    }
}

