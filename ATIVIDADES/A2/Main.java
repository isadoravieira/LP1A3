import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        Venda venda = new Venda();

        venda.produtos.add(new Produto("Óculos", 1, 300.0));
        venda.produtos.add(new Produto("Carregador", 2, 35.0));
        venda.produtos.add(new Produto("Copo", 3, 7.0));
        venda.produtos.add(new Produto("Caderno", 4, 30.0));
        venda.produtos.add(new Produto("Liquidificador", 5, 150.0));

        
        int n = venda.produtos.size();
        int i = 0;

        venda.listarProdutos();

        System.out.println("\nInsira o ID do produto que você deseja comprar: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        try{
            for(i = 0 ; i <= n ; i ++){
                if(x == i++){
                    venda.venderProduto(null);
                    break;
                } 
                else{
                    System.out.println("Esse Id não existe. Tente novamente.");
                }
            }
            
        }finally{

        }
       
    }
}
