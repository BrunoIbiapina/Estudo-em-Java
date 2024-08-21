package projeto08;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void detalhesDolivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }

    public boolean compararPaginas(Livro outrolivro) {
        return this.numeroDePaginas > outrolivro.numeroDePaginas;
    }
}
