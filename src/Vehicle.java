public class Vehicle {//базовый класс
    String model;
    double mass;
    Engine engine;

    public Vehicle(String model, double mass, Engine engine) {
        this.model = model;
        this.mass = mass;
        this.engine = engine;
    }

    public void move(String punktA, String punktB){
        engine.work();
        System.out.println(model+" перемещается из "+punktA+"  в "+punktB);
    }
}
