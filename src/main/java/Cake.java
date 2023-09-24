public class Cake implements Food {
    private int quantity;

    public Cake(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public int getSatiety() {
        return quantity*2;
    }

    @Override
    public int getGreasiness() {
        return quantity*4;
    }
}