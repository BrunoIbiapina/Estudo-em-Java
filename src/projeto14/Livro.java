package projeto14;

public class Livro {
    String titulo, autor;
    int numeroPagina;

    public Livro(String titulo, String autor, int numeroPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    public void exibirLivro() {
        System.out.println("O titulo do livro é: " + titulo + ".");
        System.out.println("O autor é: " + autor + ".");
        System.out.println("Contem: " + numeroPagina + " páginas.");
    }

    public void adicionarPaginas(int paginas) {
        numeroPagina += paginas;
    }

    public boolean ehGrande() {
        return numeroPagina > 300;
        
    }
}
