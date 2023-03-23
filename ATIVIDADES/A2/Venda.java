import java.util.ArrayList;

public class Venda{

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto (Produto produto){
        produtos.add(produto);
    }

    

   public void listarProdutos(){
        System.out.println("\nPRODUTOS À VENDA: \n");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + " - NOME: " + produto.getNome() + " - PREÇO: " + produto.getPreco());
        }
    }


    public void venderProduto (Produto produto){
        produtos.remove(produto);
    }


}