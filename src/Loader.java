
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());

        murka.meow();
        System.out.println("Murka weight: " + murka.getWeight());

        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());
    }
}