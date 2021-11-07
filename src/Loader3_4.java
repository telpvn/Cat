public class Loader3_4 {
    public static void main(String[] args) {
//        Cat vasya = new Cat();
//        System.out.println(vasya.getWeight());

//        Cat.totalWeight = 10000;
//
//        Cat vasya = new Cat();
//        System.out.println(Cat.getTotalWeight());
    }
}
/**
 * public static int count = 0;
 *
 *     public Cat() {
 *         weight = 1500.0 + 3000.0 * Math.random();
 *         originWeight = weight;
 *         minWeight = 1000.0;
 *         maxWeight = 9000.0;
 *         count++;
 *         status = "New"; // необязательно, но можно проинциализировать, для красоты
 *     }
 *     public static int getCount(){
 *         return count;
 *     }
 *     public void meow() {
 *         weight = weight - 1;
 *         updateStatus(); // 2) обновляем статус в каждом мутаторе (методе изменяющем состояние), т.к. он потенциально может привести к изменению статуса
 *         System.out.println("Meow");
 *     }
 *
 *     public void feed(Double amount) {
 *         weight = weight + amount;
 *         updateStatus(); // см 2)
 *     }
 *
 *     public void drink(Double amount) {
 *         weight = weight + amount;
 *         updateStatus(); // см 2)
 *     }
 *
 *     public double getWeight() {
 *         return weight;
 *     }
 *
 *     public String getStatus() {
 *         return status;
 *     }
 *
 *     // 3) проверка статуса на изменение
 *     void updateStatus() {
 *         if (weight < minWeight) {
 *             status = "Dead";
 *             count--; // теоретически это можно вынести в отдельный метод, но только если программа будет эволюционировать, а пока можно и так
 *         } else if (weight > maxWeight) {
 *             status = "Exploded";
 *             count--;
 *         } else if (weight > originWeight) {
 *             status = "Sleeping";
 *         } else {
 *             status = "Playing";
 *         }
 *     }
 *
 * }
 */

