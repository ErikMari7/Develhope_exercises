package JavaAdvanced.Capitolo2.esercizio3;

public class Fruit {

    public String name;



    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
