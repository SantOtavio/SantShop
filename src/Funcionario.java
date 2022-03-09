import java.util.ArrayList;

public class Funcionario extends Pessoa {
    int registration;
    String password;

    public static ArrayList<Funcionario> colaboratorsList = new ArrayList<Funcionario>();

    @Override
    public String toString() {
        return "Funcionario{" +
                "pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", numero=" + numero +
                ", cep=" + cep +
                ", registration=" + registration +
                ", password='" + password + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<Funcionario> getColaboratorsList() {
        return colaboratorsList;
    }

    public static void setColaboratorsList(ArrayList<Funcionario> colaboratorsList) {
        Funcionario.colaboratorsList = colaboratorsList;
    }

    public Funcionario(String pais, String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep, String nome, String cpf, String email, String telefone, String genero, int idade, int registration, String password) {

        super(pais, estado, cidade, bairro, rua, complemento, numero, cep, nome, cpf, email, telefone, genero, idade);
        this.registration = registration;
        this.password = password;
    }

    public static void registerClient(String pessoaCpf, String pessoaEmail, String pessoaTelefone, int pessoaIdade, String pessoaNome, String pessoaGenero, int record, String pais, String estado, String cidade, String bairro, String rua, int numero, int cep, String complemento) {
        Cliente cTemp = new Cliente(pais, estado, cidade, bairro, rua, complemento, numero, cep, pessoaNome, pessoaCpf, pessoaEmail, pessoaTelefone, pessoaGenero, pessoaIdade, record);
        Cliente.clientList.add(cTemp);
    }

    public static void sellProduct(int qtdProduct, int codigo) {
        for (int i = 0; i < Produto.listProducts.size(); i++) {
            if (codigo == Produto.listProducts.get(i).codigo && Produto.listProducts.get(i).qtd >= qtdProduct) {
                Produto.listProducts.get(i).setQtd(Produto.listProducts.get(i).getQtd() - qtdProduct);
            } else {
                System.out.println("ERROR");
            }
        }
    }


    public static boolean verifyFuncionario(int registration, String senha) {
        for (int i = 0; i < colaboratorsList.size(); i++) {
            if (registration == colaboratorsList.get(i).getRegistration() && senha.equals(colaboratorsList.get(i).getPassword())) {
                System.out.println("ENTROU");
                return true;
            }
        }
        return false;
    }
}
