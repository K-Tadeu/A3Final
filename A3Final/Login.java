public class Login {
    private String usernameEntrada;
    private String senhaEntrada;
    private String usernameDb;
    private String senhaDb;

    public void login(InterfaceLogin il) {
        if (usernameEntrada.equals(il.getUsername()) && senhaEntrada.equals(il.getSenha())) {
            redirecionar("home");
        } else {
            rejeitarLogin();
        }
    }

    public void rejeitarLogin() {
        redirecionar("login");
    }

    public void redirecionar(String destino) {
    }

    public String getUsernameEntrada() {
        return usernameEntrada;
    }

    public void setUsernameEntrada(String usernameEntrada) {
        this.usernameEntrada = usernameEntrada;
    }

    public String getSenhaEntrada() {
        return senhaEntrada;
    }

    public void setSenhaEntrada(String senhaEntrada) {
        this.senhaEntrada = senhaEntrada;
    }

    public String getUsernameDb() {
        return usernameDb;
    }

    public void setUsernameDb(String usernameBd) {
        this.usernameDb = usernameBd;
    }

    public String getSenhaDb() {
        return senhaDb;
    }

    public void setSenhaDb(String senhaBd) {
        this.senhaDb = senhaBd;
    }

}
