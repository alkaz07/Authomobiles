public class Main {
    public static void main(String[] args) {
        cartest1();
    }

    private static void cartest1() {
      /*  Car c1 = new Sedan("логан", 1.1, "синий", 2.5);
        Vehicle c2 = new Sedan("астра", 1, "желтый", 3, 2.1);
        Car c3 = new Crossover("Кашкай", 2, "белый", 5, 50);

        c3.move("Точка А", "Точка Б");*/
        Car c4 = new Sedan("гольф", 1.2, "белый", 2, new Engine("двс", 110));
        c4.move("Точка А", "Точка Б");
    }
}