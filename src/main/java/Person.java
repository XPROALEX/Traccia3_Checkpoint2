public class Person {
    private int hunger;

    public Person(int hunger) {
        this.hunger = hunger;
    }

    public void eat(Food food, Cutlery cutlery) {
        if (cutlery.getDirtiness() > 0) {
            throw new RuntimeException("The cutlery is dirty , change it");
        }
        hunger -= food.getSatiety();
        if (hunger < 0) {
            hunger = 0;
        }
        cutlery.onUse(food);
    }

    @Override
    public String toString() {
        return "Person{" +
                "hunger=" + hunger +
                '}';
    }
}
