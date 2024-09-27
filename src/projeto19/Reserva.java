package projeto19;

public class Reserva {
    public String cliente;
    private int numeroQuartos;
    private boolean status;

    
    public void reservar(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
        this.status = true;
        this. cliente = cliente;

    }

    public void cancelar() {
        this.status = false;

    }

    public void status(boolean estadoQuarto) {
        if (status == true) {
            System.out.println("Está reservado");
        } else {
            System.out.println("Não está reservado");
        }
    }

    public void exibirInformacoes() {
        System.out.println(" Nome do cliente é: " + cliente);
        System.out.println("Numero do quarto reservado: " + numeroQuartos);
        status(status);

    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
