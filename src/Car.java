public class Car extends Vehicle{
    String color;

    public Car(String model, double mass, Engine engine, String color) {
        super(model, mass, engine);
        this.color = color;
    }
}
