package projeto14;

public class Program {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Aprendendo Java", "Bruno Ibiapina", 200);
        livro1.exibirLivro();
        livro1.adicionarPaginas(500);
        if(livro1.ehGrande()){
            System.out.println("Livro é grande.");
        }
        else{
            System.out.println("Não é grande");
        }

    }
}
