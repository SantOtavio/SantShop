import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    int codigo, qtd;
    String desc, marca, modelo;
    double valor;

    static ArrayList<Produto> listProducts = new ArrayList<Produto>();

    public Produto(int codigo, int qtd, String desc, String marca, String modelo, double valor) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.desc = desc;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void registerProduct() {
        Scanner sc = new Scanner(System.in);

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

        Produto pTemp = new Produto(codigo, qtd, desc, marca, modelo, valor);
        listProducts.add(pTemp);
    }

    public static void verifyInventory(int productCode) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (productCode == listProducts.get(i).codigo) {
                System.out.println("Quantidade: " + listProducts.get(i).qtd);
            } else {
                System.out.println("Código do produto invalido ou não cadastrado no sistema!");
            }
        }
    }
}
