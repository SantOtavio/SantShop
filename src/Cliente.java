import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
    static Scanner sc = new Scanner(System.in);
    int record;

    static ArrayList<Cliente> clientList = new ArrayList<Cliente>();

    public Cliente(String nome, String cpf, String email, String telefone, String genero, int idade, int record) {
        super(nome, cpf, email, telefone, genero, idade);
        this.record = record;
    }

    public static void registerClient(String pessoaCpf, String pessoaEmail, String pessoaTelefone, int pessoaIdade, String pessoaNome, String pessoaGenero) {
        System.out.println("Insira o cadastro do cliente:");
        int record = sc.nextInt();

        Cliente cTemp = new Cliente(pessoaNome, pessoaCpf, pessoaEmail, pessoaTelefone, pessoaGenero, pessoaIdade, record);
        Cliente.clientList.add(cTemp);
    }
}
