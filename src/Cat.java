
public class Cat {
//    public static double totalWeight;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;



    private String name;

    public static int count;  // Статическая переменная count

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public static double getTotalWeight() {
//        return totalWeight;
//    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    // Создание метода который будет возвращать массу съеденной еды
    public Double getEaten() {
        Double result = weight - originWeight;
        return (result < 0 ? 0 : result);
    }

    // Создание метода сходить в туалет
    public void pee() {
        weight = weight - 100;
        System.out.println("The cat is relieved");
    }


    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}