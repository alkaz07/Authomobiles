public class Sedan extends Car{
    int doors = 5;
    double length;

    public Sedan(String model, double mass, String color, double length, Engine e) {
        super(model, mass,e, color);
        this.length = length;
    }

    public Sedan(String model, double mass, String color, int doors, double length, Engine e) {
        super(model, mass,e, color);
        this.doors = doors;
        this.length = length;
    }
}
