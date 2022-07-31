package ArrayOfObjects;

public class Food {
    String name;
    Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" + "name='" + name + '\'' + '}';
    }
}
