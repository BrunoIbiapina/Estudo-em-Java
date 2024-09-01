package projeto21;

public class Funcionario {
    public String nome;
    private double salario;
    private double aumento;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += salario * (percentual / 100);

    }
    public double getsalarioTotal(){
        return this.salario;
        
    }

    public void exibirDados() {
        System.out.println("Nome do funcionário é: " + nome);
        System.out.println("Seu salário é: " + salario);
        

    }
    public void exibirDadosTotal(){
        
        System.out.println("Novo salário do funcionário após o aumento é R$ " + getsalarioTotal());
    }
}
