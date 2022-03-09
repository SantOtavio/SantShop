import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Gerente fAdmin = new Gerente("Brasil", "Santa Catarina", "Jaraguá do Sul", "Água Verde", "Teodoro Acípio Fagundes", "Casa", 225, 89254480, "Otavio Augusto dos Santos", "12710485907", "otavio.santos3006@gmail.com", "47988033684", "Masculino", 16, 1, "0000");
        Funcionario.colaboratorsList.add(fAdmin);


        principalMenu();
    }

    public static void principalMenu() {
        System.out.println("+++++MENU PRINCIPAL+++++" +
                "\n1 - Funcionário" +
                "\n2 - Cliente");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                colaboratorMenu();
                break;
            case 2:
                clientMenu();
        }
    }

    private static void clientMenu() {
    }

    private static void colaboratorMenu() {
        System.out.println("+++++MENU FUNCIONARIO+++++" +
                "\n1 - Entrar");
        for (int i = 0; i < Funcionario.colaboratorsList.size() ; i++){
            System.out.println(Funcionario.colaboratorsList.get(i).toString());
        }
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Insira o número da matricula:");
            int registration = sc.nextInt();
            System.out.println("Insira a senha:");
            String senha = sc.next();
            if ((Funcionario.verifyFuncionario(registration, senha))) {
                funcionarioMenu();
            } else {
                colaboratorMenu();
            }
        } else {
            System.out.println("SEU BURRO, SÓ TEM UMA OPÇÃO E TU AINDA CONSEGUE ERRAR!");
            colaboratorMenu();
        }
    }

    private static void funcionarioMenu() {
        int choose;
        System.out.println("1 - Vender" +
                "\n2 - Cadastrar Cliente" +
                "\n3 - Verificar Estoque" +
                "\n4 - Cadastrar Produto" +
                "\n5 - Voltar");


        if (Funcionario.colaboratorsList.get(0) instanceof Gerente) {
            System.out.println("++++MENU GERENTE++++" +
                    "\n6 - Cadastrar Funcionario");
        }

        choose = sc.nextInt();

        if (choose == 6) {
            registerMenu(choose = 1);
        }

        switch (choose) {
            case 1:
                sellProduct();
                break;
            case 2:
                registerMenu(choose);
                break;
            case 3:
                System.out.println("Insira o código do produto para verificação de estoque:");
                int productCode = sc.nextInt();
                verifyInventory(productCode);
                break;
            case 4:
                registerProduct();
                break;
            case 5:
                principalMenu();
                break;
        }
    }

    private static void sellProduct() {
        System.out.println("Insira o código do produto:");
        int codigo = sc.nextInt();

        System.out.println("Insira o valor do produto:");
        double valor = sc.nextDouble();

        System.out.println("Insira o código do cliente:");
        int clientCode = sc.nextInt();

        System.out.println("Insira a quantidade de produtos vendidos:");
        int qtdProduct = sc.nextInt();

        Funcionario.sellProduct(qtdProduct, codigo);

        colaboratorMenu();
    }

    private static void verifyInventory(int productCode) {
        Produto.verifyInventory(productCode);
    }

    private static void registerProduct() {
        System.out.println("Insira o código do produto:");
        int codigo = sc.nextInt();

        System.out.println("Insira a descrição do produto:");
        String desc = sc.next();

        System.out.println("Insira a marca do produto:");
        String marca = sc.next();

        System.out.println("Insira o modelo do produto:");
        String modelo = sc.next();

        System.out.println("Insira o valor do produto:");
        double valor = sc.nextDouble();

        System.out.println("Insira a quantidade de produtos:");
        int qtd = sc.nextInt();

        Produto.registerProduct(codigo, qtd, marca, modelo, desc, valor);
        colaboratorMenu();
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

        System.out.println("Insira o país:");
        String pais = sc.next();

        System.out.println("Insira o estado:");
        String estado = sc.next();

        System.out.println("Insira a cidade:");
        String cidade = sc.next();

        System.out.println("Insira o bairro:");
        String bairro = sc.next();

        System.out.println("Insira a rua:");
        String rua = sc.next();

        System.out.println("Insira o número da casa:");
        int numero = sc.nextInt();

        System.out.println("Insira o cep:");
        int cep = sc.nextInt();

        System.out.println("Insira o complemento:");
        String complemento = sc.next();

        if (choose == 1) {
            System.out.println("Insira a matricula:");
            int registration = sc.nextInt();

            System.out.println("Insira a senha do funcionario:");
            String password = sc.next();
            Gerente.registerColaborator(pais, estado, cidade, bairro, rua, complemento, numero, cep , pessoaNome, pessoaCpf, pessoaEmail, pessoaTelefone, pessoaGenero, pessoaIdade, registration, password);
            colaboratorMenu();
        } else if (choose == 2) {
            System.out.println("Insira o cadastro do cliente:");
            int record = sc.nextInt();
            Funcionario.registerClient(pessoaCpf, pessoaEmail, pessoaTelefone, pessoaIdade, pessoaNome, pessoaGenero, record, pais, estado, cidade, bairro, rua, numero, cep, complemento);
            colaboratorMenu();
        } else {
            System.out.println("ERROR");
            registerMenu(choose);
        }
    }
}
