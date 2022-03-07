import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    int registration;
    String password;

    static ArrayList<Funcionario> colaboratorsList = new ArrayList<Funcionario>();

    public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade, int registration, String password) {
        super(nome, cpf, email, telefone, genero, idade);
        this.registration = registration;
        this.password = password;
    }

    public static void sellProduct(){
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira o código do produto:");
        int codigo = sc.nextInt();

        System.out.println("Insira o valor do produto:");
        double valor = sc.nextDouble();

        System.out.println("Insira o código do cliente:");
        int clientCode = sc.nextInt();
    }
}
