import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        principalMenu();
    }

    private static void principalMenu() {
        System.out.println("+++++MENU PRINCIPAL+++++" +
                "\n1 - Funcionário" +
                "\n2 - Cliente");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                colaboratorMenu();
                break;
            case 2:
                // clientMenu();
        }
    }

    private static void colaboratorMenu() {
        System.out.println("+++++MENU FUNCIONARIO+++++" +
                "\n1 - Gerência" +
                "\n2 - Funcionário");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("1 - Cadastrar Funcionário");
                choose = sc.nextInt();
                registerMenu(choose);
                break;
            case 2:
                System.out.println("1 - Vender" +
                        "\n2 - Cadastrar Cliente" +
                        "\n3 - Verificar Estoque" +
                        "\n4 - Cadastrar Produto");
                choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        break;
                    case 2:
                        registerMenu(choose);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
        }
    }

    private static void registerMenu(int choose) {
        System.out.println("+++++MENU REGISTRO+++++" +
                "\nInsira o nome: ");
        String pessoaNome = sc.next();

        System.out.println("Insira o cpf:");
        String pessoaCpf = sc.next();

        System.out.println("Insira a idade:");
        int pessoaIdade = sc.nextInt();

        System.out.println("Insira o email:");
        String pessoaEmail = sc.next();

        System.out.println("Insira o telefone:");
        String pessoaTelefone = sc.next();

        System.out.println("Insira o genero:");
        String pessoaGenero = sc.next();

        if (choose == 1) {
            Gerente.registerColaborator(pessoaCpf , pessoaEmail , pessoaTelefone , pessoaIdade , pessoaNome , pessoaGenero);
        } else if (choose == 2) {
            Cliente.registerClient(pessoaCpf , pessoaEmail , pessoaTelefone , pessoaIdade , pessoaNome , pessoaGenero);
        } else {
            System.out.println("ERROR");
            registerMenu(choose);
        }
    }
}
