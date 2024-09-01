package projeto20;

public class Estoque {
    public String item;
    private int quantidade;
    private int quantidadeInicial;
    private int quantidadeRemovida;
    
public Estoque(String item, int quantidadeInicial){
    this.item = item;
    this.quantidade = quantidadeInicial;
    this.quantidadeInicial = quantidadeInicial;
    this.quantidadeRemovida = 0;
}
public void adicionarEstoque(int quantidade){
    this.quantidade += quantidade;
    
}
public void removerEstoque(int quantidade){
    if(this.quantidade >= quantidade){
        this.quantidade -= quantidade;
        this.quantidadeRemovida += quantidade;
        System.out.println(quantidade + " unidades removidas do estoque de " + item + ".");
    }
    else{
        System.out.println("Quantidade insuficiente no estoque de " + item + ".");
    }
}
public void exibirInformacoes(){
    System.out.println("Quantidade inicial no estoque: " + quantidadeInicial + " unidades.");
    System.out.println("Quantidade removida no estoque: " + quantidadeRemovida + " unidades.");
    System.out.println("Total em estoque após movimentações: " + quantidade + " unidades.");
}
}
