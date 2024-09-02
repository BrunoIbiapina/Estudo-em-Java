package projeto23;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Evento evento = new Evento("Java", 20,30);

        evento.adicionarCurso(new Curso("Java Avançado", 20));
        evento.adicionarCurso(new Curso("Desenvolvimento Web", 15));
        evento.adicionarCurso(new Curso("Inteligência Artificial", 10));
        

        
        evento.exibirMenu();
        
       
        
        
        
    }
    
}
