import java.util.ArrayList;

public class Funcionario extends Pessoa{
    int registration;
    String password;

    static ArrayList<Funcionario> colaboratorsList = new ArrayList<Funcionario>();

    public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade, int registration, String password) {
        super(nome, cpf, email, telefone, genero, idade);
        this.registration = registration;
        this.password = password;
    }
}
