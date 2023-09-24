import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person(1000);
        Cutlery fork = new Cutlery();
        Cutlery knife = new Cutlery();
        Cutlery spoon = new Cutlery();
        HashMap<String, Food> menu = new HashMap<>();
        menu.put("first_course", new Pasta(300));
        menu.put("fruit", new Apple(100));
        menu.put("snack", new Cake(200));
        System.out.printf("%s Fork dirtiness=%s Knife dirtiness=%s Spoon dirtiness=%s\n",alex.toString() , fork.getDirtiness() , knife.getDirtiness() , spoon.getDirtiness());
        menu.forEach((key, value) -> {
            System.out.println(key +" "+ value);
        });
        alex.eat(menu.get("first_course"), fork);
        menu.remove("first_course");
        alex.eat(menu.get("fruit"), knife);
        menu.remove("fruit");
        alex.eat(menu.get("snack"), spoon);
        menu.remove("snack");
        System.out.printf("%s Fork dirtiness=%s Knife dirtiness=%s Spoon dirtiness=%s\n",alex.toString() , fork.getDirtiness() , knife.getDirtiness() , spoon.getDirtiness());
        System.out.println("New menu= "+menu);
    }
}
