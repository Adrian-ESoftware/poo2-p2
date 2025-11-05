public class GerenciadorNotificacoes {
    public void enviar(Notificavel canal, String mensagem) {
        if (canal == null) {
            throw new IllegalArgumentException("Canal de notificação não pode ser nulo");
        }
        canal.enviarNotificacao(mensagem);
    }
}

