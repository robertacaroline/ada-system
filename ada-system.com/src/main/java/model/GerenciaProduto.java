package model;

import dao.impl.AlbumMusicaDaoImpl;
import service.impl.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciaProduto {
    public LivroServiceImpl livroService;
    public AlbumMusicaServiceImpl albumMusicaService;
    public JogoServiceImpl jogoService;
    public FilmeServiceImpl filmeService;
    public BrinquedoServiceImpl brinquedoService;

    public GerenciaProduto(LivroServiceImpl livroService, AlbumMusicaServiceImpl albumMusicaService, JogoServiceImpl jogoService, FilmeServiceImpl filmeService, BrinquedoServiceImpl brinquedoService) {
        this.livroService = livroService;
        this.albumMusicaService = albumMusicaService;
        this.jogoService = jogoService;
        this.filmeService = filmeService;
        this.brinquedoService = brinquedoService;
    }

    public void criaProdutosInciais(){
        Brinquedo brinquedo1 = new Brinquedo("LEGO", 20.00, 10, "Desenho");
        Brinquedo brinquedo2 = new Brinquedo("FUNKO POP", 30.00, 12, "Desenho");
        List<String> genJogo1 = new ArrayList<>();
        genJogo1.add("Battle Royale");
        List<String> genfilme = new ArrayList<>();
        genfilme.add("Romance");
        genfilme.add("Suspence");
        List<String> genLivro = new ArrayList<>();
        genLivro.add("Romance");
        List<String> diretores = new ArrayList<>();
        diretores.add("Roberta Caroline");
        List<String> produtores = new ArrayList<>();
        produtores.add("Caroline Roberta");
        List<String> genMusicas = new ArrayList<>();
        genMusicas.add("Classica");
        List<String> musicas = new ArrayList<>();
        musicas.add("Break - Fazerdaze");
        musicas.add("The Only Exception - Paramore");

        List<String> selos = new ArrayList<>();
        selos.add("selo1");
        Jogo jogo1 = new Jogo("Fortnite", 30.00, 10, genJogo1, "records", "estudio1");
        Jogo jogo2 = new Jogo("Free Fire", 80.00, 15, genJogo1, "records", "estudio1");
        Livro livro1 = new Livro("Crepusculo", 25.0, 654, genLivro, "Stephenie Meyer", "Objetiva");
        Livro livro2 = new Livro("Lua Nova", 36.0, 876, genLivro, "Stephenie Meyer", "Objetiva");
        Filme filme1 = new Filme("Eclipse", 10.0, 45, genfilme, diretores, produtores);
        Filme filme2 = new Filme("Amanhecer", 15.0, 87, genfilme, diretores, produtores);
        AlbumMusica album1 = new AlbumMusica("Brand New Eyes", 50.0, 98, genMusicas, musicas, selos);
        AlbumMusica album2 = new AlbumMusica("The Big Roar", 70.0, 18, genMusicas, musicas, selos);

        brinquedoService.salvar(brinquedo1, brinquedo1.getId());
        brinquedoService.salvar(brinquedo2, brinquedo2.getId());
        jogoService.salvar(jogo1, jogo1.getId());
        jogoService.salvar(jogo2, jogo2.getId());
        livroService.salvar(livro1, livro1.getId());
        livroService.salvar(livro2, livro2.getId());
        filmeService.salvar(filme1, filme1.getId());
        filmeService.salvar(filme2, filme2.getId());
        albumMusicaService.salvar(album1, album1.getId());
        albumMusicaService.salvar(album2, album2.getId());

    }
    public void editarProduto(){
        List<Produto> produtos = new ArrayList<>();
       
        produtos.addAll(jogoService.buscarTodos());
        produtos.addAll(albumMusicaService.buscarTodos());
        produtos.addAll(livroService.buscarTodos());
        produtos.addAll(filmeService.buscarTodos());
        produtos.addAll(brinquedoService.buscarTodos());
        for (Produto p:
                produtos) {
            System.out.println(p.toString());
        }
    }


    public void listarTodos(){
        List<Produto> produtos = new ArrayList<>();
        produtos.addAll(jogoService.buscarTodos());
        produtos.addAll(albumMusicaService.buscarTodos());
        produtos.addAll(livroService.buscarTodos());
        produtos.addAll(filmeService.buscarTodos());
        produtos.addAll(brinquedoService.buscarTodos());
        for (Produto p:
                produtos) {
            System.out.println(p.toString());
        }
    }

    public void listarTodosEstoque(){
        List<Produto> produtos = new ArrayList<>();
        produtos.addAll(jogoService.buscarTodos());
        produtos.addAll(albumMusicaService.buscarTodos());
        produtos.addAll(livroService.buscarTodos());
        produtos.addAll(filmeService.buscarTodos());
        produtos.addAll(brinquedoService.buscarTodos());
        for (Produto p:
                produtos) {
            System.out.println("NOME: " + p.getNome()+"\n");
            System.out.println("PREÇO: " + p.getPreco()+"\n");
            System.out.println("QTD ESTOQUE: " + p.getEstoque().getQuantidade()+"\n\n");
        }
    }

    public void listarPorCategoria(int opcaoSelecionada){
        List<Produto> produtos = new ArrayList<>();
        switch (opcaoSelecionada){
            case 1:
                produtos.addAll(jogoService.buscarTodos());
                break;
            case 2:
                produtos.addAll(albumMusicaService.buscarTodos());
                break;
            case 3:
                produtos.addAll(livroService.buscarTodos());
                break;
            case 4:
                produtos.addAll(filmeService.buscarTodos());
                break;
            case 5:
                produtos.addAll(brinquedoService.buscarTodos());
                break;
            default:
                System.out.println("OPÇAO INVALIDA\n");

        }
        for (Produto p:
                produtos) {
            System.out.println("NOME: " + p.getNome()+"\n");
            System.out.println("QTD ESTOQUE: " + p.getEstoque().getQuantidade()+"\n\n");
        }
    }


}
