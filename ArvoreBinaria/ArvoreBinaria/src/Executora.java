import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        int opcao = 0;
        while (opcao != 9) {
            System.out.println("Escolhea a opção desejada");
            System.out.println("1 - Inseir um número na árvore binária");
            System.out.println("2 - Mostrar a árvore binária em pré ordem");
            System.out.println("3 - Mostrar a árvore binária em ordem");
            System.out.println("4 - Mostrar a árvore binária em pós ordem");
            System.out.println("5 - Remover um número da árvore binária");
            System.out.println("9 - Encerrar programa");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número que deseja inserir na árvore");
                    int numero = scanner.nextInt();
                    arvoreBinaria.inserir(numero);
                    break;
                case 2:
                    System.out.println("Árvore binária em pré ordem:");
                    arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
                    break;
                case 3:
                    System.out.println("Árvore binária em ordem:");
                    arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
                    break;
                case 4:
                    System.out.println("Árvore binária em pós ordem:");
                    arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
                    break;
                case 5:
                    System.out.println("Digite o número que deseja remover da árvore:");
                    int numeroRemover = scanner.nextInt();
                    arvoreBinaria.remover(numeroRemover);
                    break;
                case 9:
                    System.out.println("Encerrando programa");
                    break;
            }
        }
    }
}