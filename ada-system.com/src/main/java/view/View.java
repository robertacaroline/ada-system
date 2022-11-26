package view;


public class View {
    public static void menuPrincipal(){
        System.out.print("BEM-VINDE À LOJA DA ADA! (★‿★)\n\n");
        System.out.print("SELECIONE A AÇAO A SER REALIZADA\n\n");
        System.out.print("1 - GERENCIAR ESTOQUE\n");
        System.out.print("2 - GERENCIAR PRODUTOS\n");
        System.out.print("3 - FAZER UMA VENDA\n\n");
    }

    public static void menuEstoque() {
        System.out.print("1 - LISTAR TODOS OS PRODUTOS\n");
        System.out.print("2 - LISTAR TODOS OS PRODUTOS POR CATEGORIA\n");
    }

    public static void menuCategoria(){
        System.out.print("SELECIONE A CATEGORIA\n\n");
        System.out.print("1 - JOGOS\n");
        System.out.print("2 - ALBUM DE MUSICAS\n");
        System.out.print("3 - LIVROS \n");
        System.out.print("4 - FILMES\n");
        System.out.print("5 - BRINQUEDOS\n");
    }

    public static void menuProdutos(){
        System.out.print("1 - LISTAR TODOS OS PRODUTOS\n");
        System.out.print("2 - ADICIONAR NOVO PRODUTO\n");
        System.out.print("3 - ALTERAR PRODUTO\n");
        System.out.print("4 - REMOVER PRODUTO\n");
    }
}
