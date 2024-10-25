import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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

        List<String> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Toy toy = toyPool.poll();
//            System.out.println(toyPool.poll());
            if (toy != null) {
                results.add(toy.toString());
//                System.out.println(toy.toString());
            } else {
//                System.out.println("Очередь пуста");
                break;
            }
            results.add(toy.toString());
//            System.out.println(results);
        }

        try {
            writeToFile(results);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
     private static void writeToFile(List<String> data) throws IOException {
        File file = new File("results.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}