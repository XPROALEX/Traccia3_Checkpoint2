public class Pasta implements Food {
    private int quantity;

    public Pasta(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public int getSatiety() {
        return quantity * 2;
    }

    @Override
    public int getGreasiness() {
        return quantity * 3;
    }
}
