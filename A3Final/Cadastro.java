import java.time.LocalDate;

public class Cadastro {
    private String nome;
    private String sexo;
    private String username;
    private String password;
    private int idade;
    private Double pesoEmKg;
    private double altura;
    private LocalDate dataDeNascimento;

    public void cadastrar(InterfaceCadastroBd cd) {
        cd.setNome(nome);
        cd.setSexo(sexo);
        cd.setUsername(username);
        cd.setPassword(password);
        cd.setDataDeNascimento(dataDeNascimento);
        cd.setPesoEmKg(pesoEmKg);
        cd.setAltura(altura);

        cd.setCarboidratos(altura, pesoEmKg, idade, sexo);
        cd.setProteinas(pesoEmKg);
        cd.setImc(altura, pesoEmKg);
        cd.setMetabolismoBasal(altura, pesoEmKg, idade, sexo);
        cd.setQtdAgua(pesoEmKg);
    }
}
