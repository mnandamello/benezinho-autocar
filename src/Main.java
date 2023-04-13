import br.com.benezinho.model.Categoria;
import br.com.benezinho.model.Produto;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Categoria categoria;
        Produto produto;


        String nome = "";
        double preco = 0;
        double total = 0;
        boolean encerrar = false;

        do {

            var nomeCategoria = JOptionPane.showInputDialog("Categoria");
            categoria = new Categoria(nomeCategoria);

            nome = JOptionPane.showInputDialog("Nome");
            preco = Double.parseDouble(JOptionPane.showInputDialog("Preco"));

            produto = new Produto(nome , preco , categoria);
            total = total + produto.getPreco();
            System.out.println(produto);

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um produto? " +
                                                        " [1] = SIM" + " [0] = NÃO"));

            encerrar = opcao == 1 ? false : true;

        }while (encerrar == false);

        System.out.println("O valor total da compra foi: " + total);


    }
}