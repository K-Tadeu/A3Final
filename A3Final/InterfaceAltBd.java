import java.time.LocalDate;

public class InterfaceAltBd {
    private long UsuarioId;
    private String nome;
    private String sexo;
    private String username;
    private String password;
    private LocalDate dataDeNascimento;
    private Double alturaCm;
    private Double metabolismoBasal;
    private Double proteinas;
    private Double imc;
    private Double carboidratos;
    private Double qtdAguaLitros;
    private Double pesoEmKg;
    private Double peso;
    private Double altura;
    private Double idade;

    public long getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        UsuarioId = usuarioId;
    }

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

    public Double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public Double getMetabolismoBasal() {
        return metabolismoBasal;
    }

    public void setMetabolismoBasal(Double metabolismoBasal) {
        this.metabolismoBasal = metabolismoBasal;
    }

    public Double getProteinas() {
        return proteinas;
    }

    public void setProteinas(Double proteinas) {
        this.proteinas = proteinas;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(Double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public Double getQtdAguaLitros() {
        return qtdAguaLitros;
    }

    public void setQtdAguaLitros(Double qtdAguaLitros) {
        this.qtdAguaLitros = qtdAguaLitros;
    }

    public Double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(Double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }
}
