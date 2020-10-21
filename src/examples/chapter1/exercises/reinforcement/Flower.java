package examples.chapter1.exercises.reinforcement;

public class Flower {

    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public Flower() {
        this.name = "";
        this.petals = 0;
        this.price = 0f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
            "name='" + name + '\'' +
            ", petals=" + petals +
            ", price=" + price +
            '}';
    }
}
