class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private double weight; // частота выпадения игрушки

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Toy other) {
        // Сортировка по весу игрушки
        if (this.weight > other.weight) {
            return 1;
        } else if (this.weight < other.weight) {
            return -1;
        }
        return 0;
    }
}