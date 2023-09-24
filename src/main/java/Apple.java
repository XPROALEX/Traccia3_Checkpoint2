public class Apple implements Food {
    private int quantity;

    public Apple(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public int getSatiety() {
        return quantity;
    }

    @Override
    public int getGreasiness() {
        return quantity * 2;
    }
}