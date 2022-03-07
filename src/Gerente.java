import java.util.Scanner;

public class Gerente extends Pessoa {
    static Scanner sc = new Scanner(System.in);

    public static void registerColaborator(String pessoaCpf, String pessoaEmail, String pessoaTelefone, int pessoaIdade, String pessoaNome, String pessoaGenero) {
        System.out.println("Insira a matricula:");
        int registration = sc.nextInt();

        System.out.println("Insira a senha do funcionario:");
        String password = sc.next();

        Funcionario fTemp = new Funcionario(pessoaNome, pessoaCpf, pessoaEmail, pessoaTelefone, pessoaGenero, pessoaIdade, registration, password);
        Funcionario.colaboratorsList.add(fTemp);
    }
}
