public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();
        Notificavel email = new EmailNotificacao();
        Notificavel sms = new SMSNotificacao();
        Notificavel push = new PushNotificacao();

        gerenciador.enviar(email, "Seu pedido foi confirmado!");
        gerenciador.enviar(sms, "Seu código de verificação é 123456.");
        gerenciador.enviar(push, "Você tem uma nova mensagem no app.");
    }
}