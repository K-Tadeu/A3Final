import java.time.LocalDate;

public class Home {
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

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Double getAlturaCm() {
        return alturaCm;
    }

    public Double getMetabolismoBasal() {
        return metabolismoBasal;
    }

    public Double getProteinas() {
        return proteinas;
    }

    public Double getImc() {
        return imc;
    }

    public Double getCarboidratos() {
        return carboidratos;
    }

    public Double getQtdAguaLitros() {
        return qtdAguaLitros;
    }

    public Double getPesoEmKg() {
        return pesoEmKg;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getIdade() {
        return idade;
    }
}
