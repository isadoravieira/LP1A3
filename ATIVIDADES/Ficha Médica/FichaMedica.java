import java.io.*;
import java.util.Scanner;

public class FichaMedica {
	
	private static final String guardarFichas = "prontuarios/";
    
	
    public static void main(String[] args) {
    	
        
    	int opcaoEscolhida = 0;
		
		Scanner entrada  = new Scanner(System.in);
		
		do {
			
			System.out.println("\n\n---FICHA MÉDICA---\n");
			System.out.println("Escolha uma opção:");
			System.out.println("1) Criar Nova Ficha Médica.");
			System.out.println("2) Atualizar Ficha Médica.");
			System.out.println("3) Exibir Ficha Médica.");
			System.out.println("0) Sair.");
			
			opcaoEscolhida = Integer.parseInt(entrada.nextLine());
			
			switch (opcaoEscolhida) {
			case 1:				
				FichaMedica.criarFichaMedica();
				break;
			case 2:
				FichaMedica.atualizarFichaMedica();
				break;
			case 3:
				FichaMedica.exibirFichaMedica();
			}
			
		}while(opcaoEscolhida != 0);

    	
    }

    public static void criarFichaMedica() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Solicita os dados do paciente
            System.out.println("\nDigite o nome do paciente:");
            String nome = reader.readLine();
            
            System.out.println("\nDigite o sobrenome do paciente:");
            String sobrenome = reader.readLine();

            System.out.println("\nDigite a idade do paciente:");
            String idade = reader.readLine();

            System.out.println("\nDigite o gênero do paciente:");
            String genero = reader.readLine();

            System.out.println("\nDigite a altura do paciente em metros:");
            String altura = reader.readLine();

            System.out.println("\nDigite o peso do paciente em kg:");
            String peso = reader.readLine();

            // Cria arquivo de prontuário
            String nomeArquivo = guardarFichas + nome + sobrenome + ".txt";
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Escreve os dados no arquivo
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Sobrenome: " + sobrenome);
            writer.newLine();
            writer.write("Idade: " + idade + " anos");
            writer.newLine();
            writer.write("Gênero: " + genero);
            writer.newLine();
            writer.write("Altura: " + altura + " metros");
            writer.newLine();
            writer.write("Peso: " + peso + " kg");

            // Fecha o arquivo
            writer.close();
            System.out.println("Ficha médica criada com sucesso!\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void atualizarFichaMedica() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Solicita o nome e o sobrenome do paciente para atualização
            System.out.println("\nDigite o nome do paciente para atualizar os dados:");
            String nome = reader.readLine();
            System.out.println("\nDigite o sobrenome do paciente para atualizar os dados:");
            String sobrenome = reader.readLine();

            //Verifica se o arquivo de prontuario existe
            String nomeArquivo = guardarFichas + nome + sobrenome + ".txt";
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                System.out.println("Ficha médica não encontrada.\n");
                return;
            }

            // Le os dados existentes do arquivo
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader fileReaderBuffer = new BufferedReader(fileReader);
            
          //Estrutura para ler as diversas linhas do arquivo
            String linha;
            String dados = "";
            while ((linha = fileReaderBuffer.readLine()) != null) {
                dados += linha + "\n";
            }

            fileReaderBuffer.close();

            // Exibe os dados atuais do paciente
            System.out.println("\nDados atuais do paciente:");
            System.out.println(dados);

            // Solicita os dados atualizados1
            System.out.println("\nDigite os novos dados do paciente:");

            System.out.println("\nDigite a idade do paciente:");
            String novaIdade = reader.readLine();

            System.out.println("\nDigite o gênero do paciente:");
            String novoGenero = reader.readLine();

            System.out.println("\nDigite a altura do paciente em metros:");
            String novaAltura = reader.readLine();
            
            System.out.println("\nDigite o peso do paciente em kg:");
            String novoPeso = reader.readLine();

            // Atualiza os dados no arquivo
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Escreve os dados atualizados no arquivo
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Sobrenome: " + sobrenome);
            writer.newLine();
            writer.write("Idade: " + novaIdade + " anos");
            writer.newLine();
            writer.write("Gênero: " + novoGenero);
            writer.newLine();
            writer.write("Altura: " + novaAltura + " metros");
            writer.newLine();
            writer.write("Peso: " + novoPeso + " kg");

            // Fecha o arquivo
            writer.close();
            System.out.println("Ficha médica atualizada com sucesso!\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exibirFichaMedica() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Composição de objetos para conseguir ler linhas de arquivos texto

            // Solicita o nome e o sobrenome do paciente para exibição dos dados dele
            System.out.println("\nDigite o nome do paciente para exibir os dados:");
            String nome = reader.readLine();
            System.out.println("\nDigite o sobrenome do paciente para exibir os dados:");
            String sobrenome = reader.readLine();

            // Verifica se o arquivo de prontuário existe
            String nomeArquivo = guardarFichas + nome + sobrenome + ".txt";
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                System.out.println("Ficha médica não encontrada.\n");
                return;
            }

            // Le os dados do arquivo e exibe no console
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader fileReaderBuffer = new BufferedReader(fileReader);

            //Estrutura para ler as diversas linhas do arquivo
            String linha;
            while ((linha = fileReaderBuffer.readLine()) != null) {
                System.out.println(linha);
            }

            fileReaderBuffer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}

