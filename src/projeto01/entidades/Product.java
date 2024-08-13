package projeto01.entidades;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInstock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;

    }

    public void RemoveProduct(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return name
                + " , R$ "
                + String.format(" %.2f ", price)
                + " , "
                + quantity
                + " quantidade , Total: R$ "
                + String.format(" %.2f ", totalValueInstock());
    }

}
