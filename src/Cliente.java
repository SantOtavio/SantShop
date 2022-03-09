import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {
    static Scanner sc = new Scanner(System.in);
    int record;

    static ArrayList<Cliente> clientList = new ArrayList<Cliente>();



    public Cliente(String pais, String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep, String pessoaNome, String pessoaCpf, String pessoaEmail, String pessoaTelefone, String pessoaGenero, int idade, int pessoaIdade) {
        super(pais, estado, cidade, bairro, rua, complemento, numero, cep, pessoaNome, pessoaCpf, pessoaEmail, pessoaTelefone, pessoaGenero, pessoaIdade);
        this.record = record;
    }
}
