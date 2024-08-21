package projeto08;

public class Programa {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Aprendendo JAVA", "Bruno Ibiapina", 90);
        Livro livro2 = new Livro("Aprendendo Python", "Maria Laura", 100);

        livro1.detalhesDolivro();
        livro2.detalhesDolivro();

        if (livro1.compararPaginas(livro2)) {
            System.out.println("O livro" + livro1.titulo + "Tem mais página que o livro" + livro2.titulo);
        } else {
            System.out.println("O livro" + livro2.titulo + "Tem mais página que o livro" + livro1.titulo);
        }

    }
}
