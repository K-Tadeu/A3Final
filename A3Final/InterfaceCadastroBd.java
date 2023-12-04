import java.time.LocalDate;

public class InterfaceCadastroBd {
    private String nome;
    private String sexo;
    private String username;
    private String password;
    private LocalDate dataDeNascimento;
    private Double pesoEmKg;
    private Double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(Double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setProteinas(double pesoEmKg) {
    }

    public void setImc(double altura, double pesoEmKg) {
        Calculo.calcularImc(pesoEmKg, altura);
    }

    public void setMetabolismoBasal(double altura, double pesoEmKg, int idade, String sexo) {
        Calculo.calcularMetabolismoBasal(pesoEmKg, altura, idade, sexo);
    }

    public void setQtdAgua(double pesoEmKg) {
        Calculo.calcularQtdAgua(pesoEmKg);
    }

    public void setCarboidratos(double altura, double pesoEmKg, int idade, String sexo) {
        Calculo.calcularCarboidratos(pesoEmKg, altura, idade, sexo);
    }

}
