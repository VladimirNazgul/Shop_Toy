public class Main {
    public static void main(String[] args) {
        PriorityQueue<Toy> toyPool = new PriorityQueue<>();

        Toy toy1 = new Toy(1, "Конструктор", 0.3);
        Toy toy2 = new Toy(2, "Кукла", 0.2);
        Toy toy3 = new Toy(3, "Мяч", 0.5);
        Toy toy4 = new Toy(4, "Машина", 0.4);
        Toy toy5 = new Toy(5, "Робот", 0.35);

        toyPool.add(toy1);
        toyPool.add(toy2);
        toyPool.add(toy3);
        toyPool.add(toy4);
        toyPool.add(toy5);
    
    }
    
}