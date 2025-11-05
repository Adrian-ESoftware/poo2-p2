public class PayPal implements MetodoPagamento {
    private String email;
    private String senha;
    private boolean autenticado;

    public PayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.autenticado = false;
    }

    private boolean autenticar() {
        // Autenticação simulada: exige email/senha não vazios e senha com 6+ caracteres
        if (email == null || email.isBlank() || senha == null || senha.isBlank()) {
            return false;
        }
        autenticado = senha.length() >= 6;
        return autenticado;
    }

    @Override
    public boolean pagar(double valor) {
        if (valor <= 0) {
            System.out.println("Pagamento inválido: o valor deve ser maior que zero.");
            return false;
        }
        if (!autenticado && !autenticar()) {
            System.out.println("Pagamento recusado: falha na autenticação do PayPal.");
            return false;
        }
        // Simula transferência do valor
        System.out.println("Transferência via PayPal no valor de R$" + valor + " concluída com sucesso.");
        return true;
    }

    @Override
    public String getNome() {
        return "PayPal";
    }
}

