import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String pais, String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep, String nome, String cpf, String email, String telefone, String genero, int idade, int registration, String password) {

        super(pais, estado, cidade, bairro, rua, complemento, numero, cep, nome, cpf, email, telefone, genero, idade, registration, password);
    }

    static Scanner sc = new Scanner(System.in);

    public static void registerColaborator(String pais, String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep, String nome, String cpf, String email, String telefone, String genero, int idade, int registration, String password) {
        Funcionario fTemp = new Funcionario(pais, estado, cidade, bairro, rua, complemento, numero, cep, nome, cpf, email, telefone, genero, idade, registration, password);
        Funcionario.colaboratorsList.add(fTemp);
    }
}
