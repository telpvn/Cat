/**
 *                  Что нужно сделать
 * Создайте 5–7 кошек, вызовите у них различные методы:
 * 1.	Выведите в консоль вес созданных кошек.
 * 2.	Покормите двух кошек, после этого распечатайте их вес (убедитесь, что вес изменился).
 * 3.	Перекормите кошку, чтобы ее статус стал Exploded.
 * 4.	«Замяукайте» кошку до статуса Dead.
 * 5.	Отправьте в репозиторий Git коммит с выполненным заданием.
 *
 *                  Рекомендации
 * Чтобы перекормить или «замяукать» кошку, используйте цикл while с условием проверки статуса кошки.
*/

public class Loader
{
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        System.out.println("Cat1 weight: " + cat1.getWeight());
//        cat1.feed(1000.0);
//        System.out.println("Cat1 weight: " + cat1.getWeight());
//
//        Cat cat2 = new Cat();
//        System.out.println("Cat2 weight: " + cat2.getWeight());
//        cat2.feed(1000.2);
//        System.out.println("Cat2 weight: " + cat2.getWeight());
//
//        System.out.println();


        Cat cat3 = new Cat();
        double maxWeight = 9000.0;

        System.out.println("Cat3 status: " + cat3.getStatus());
        while (cat3.getWeight() <= maxWeight) {
            cat3.feed(1000.0);
        }
        System.out.println("Cat3 status: " + cat3.getStatus());



//        Cat cat4 = new Cat();
//        System.out.println("Cat4 weight: " + cat4.getWeight());
//
//        Cat cat5 = new Cat();
//        System.out.println("Cat5 weight: " + cat5.getWeight());
//
//        Cat cat6 = new Cat();
//        System.out.println("Cat6 weight: " + cat6.getWeight());
//
//        Cat cat7 = new Cat();
//        System.out.println("Cat7 weight: " + cat7.getWeight());

    }
}