package projeto08;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Livro livro1 = new Livro("Aprendendo JAVA", "Bruno Ibiapina", 90);

        livro1.detalhesDolivro();

        Livro livro2 = new Livro();
        System.out.println("Digite nome do livro: ");
        livro2.titulo = entrada.nextLine();
        System.out.println("Digite nome do autor: ");
        livro2.autor = entrada.nextLine();
        System.out.println("Digite número de páginas: ");
        livro2.numeroDePaginas = entrada.nextInt();

        livro2.detalhesDolivro();

        if (livro1.compararPaginas(livro2)) {
            System.out.println("O livro " + livro1.titulo + " tem mais página que o livro " + livro2.titulo);
        } else {
            System.out.println("O livro " + livro2.titulo + " Tem mais página que o livro " + livro1.titulo);
        }

    }
}
