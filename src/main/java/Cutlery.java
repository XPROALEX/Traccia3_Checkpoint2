public class Cutlery {
    private int dirtiness;

    public Cutlery() {
    }

    public Cutlery(int dirtiness) {
        this.dirtiness = dirtiness;
    }

    public int getDirtiness() {
        return dirtiness;
    }

    public void onUse(Food food) {
        dirtiness += food.getGreasiness();
    }

    @Override
    public String toString() {
        return "Cutlery{" +
                "dirtiness=" + dirtiness +
                '}';
    }
}

