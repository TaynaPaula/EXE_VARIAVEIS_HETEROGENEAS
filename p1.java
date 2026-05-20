import java.util.Scanner;

public class RECURSIVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        // VALIDAÇÃO: Garante que o número esteja entre 3 e 18
        // O professor corrigiu a lógica do 'while' para usar os operadores certos
        System.out.println("Digite um valor entre 3 e 18:");
        num = input.nextInt();
        
        while (num < 3 || num > 18) { 
            System.out.println("Valor deve ser maior ou igual a 3 e menor ou igual a 18");
            num = input.nextInt();
        }

        int resultado = Serie(num);
        System.out.println("Resultado da série: " + resultado);
        
        input.close();
    }

    // CORREÇÃO: Adicionado o tipo 'int' no parâmetro 'num'
    public static int Serie(int num) {
        // CORREÇÃO: O caso base precisa retornar 0 para encerrar a soma corretamente
        if (num == 0) {
            return 0; 
        } else {
            // Passo recursivo: soma o número atual com o resultado do próximo
            return num + Serie(num - 1);
        }
        // CORREÇÃO: Aquele "return Serie;" que estava aqui no final foi removido!
    }
}
//***********************
import java.util.Scanner;

public class ClassePrincipal {

    // CORREÇÃO: Declarada como GLOBAL (static) para os outros métodos enxergarem
    public static int[][] mat = new int[36][300]; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc = 0;

        while (opc != 9) {
            System.out.println("\nOpc 1: Carrega matriz \nOpc 2: Mostra dados \nOpc 9: Sair");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    // CORREÇÃO: Como a matriz agora é global, passamos apenas o Scanner
                    Pcarrega(input); 
                    break;
                case 2:
                    Pmostra();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        input.close();
    }

    // MÉTODO 1: CARREGA MATRIZ
    public static void Pcarrega(Scanner input) {
        // Percorre as linhas (ex: 36 meses)
        for (int i = 0; i < mat.length; i++) {
            // Percorre as colunas (ex: 300 produtos)
            for (int j = 0; j < mat[i].length; j++) {
                
                System.out.println("Digite o valor de venda para o período [" + i + "][" + j + "]:");
                int num = input.nextInt();

                // CORREÇÃO: Usar WHILE para tratar e travar valores inválidos
                while (num < 20 || num > 3000) {
                    System.out.println("Valor deve ser maior que 20 e menor que 3000. Digite novamente:");
                    num = input.nextInt();
                }

                // CORREÇÃO: Especificar as posições [i][j] onde o número será guardado
                mat[i][j] = num; 
            }
        }
    }

    // MÉTODO 2: MOSTRA E CALCULA
    public static void Pmostra() {
        int soma = 0;
        double media = 0;

        // 1º Passo: Somar todas as vendas
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // CORREÇÃO: Removido o ".length". Somamos direto o valor do produto armazenado
                soma += mat[i][j]; 
            }
        }
        System.out.println("O total das vendas é: " + soma);

        // 2º Passo: Calcular a média total de todas as células da matriz
        // (Total de linhas * Total de colunas = 36 * 300)
        int totalElementos = mat.length * mat[0].length;
        media = (double) soma / totalElementos;
        System.out.println("A média das vendas é: " + media);

        // 3º Passo: Verificar quem ficou abaixo da média
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int valor = mat[i][j];
                
                if (valor < media) {
                    System.out.println("No mês/período: " + i + " o produto: " + j + " estava abaixo da média. Quantidade/Valor: " + valor);
                }
            }
        }
    }
}
