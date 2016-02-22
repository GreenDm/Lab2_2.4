package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Person person1 =new Person();

        person1.name("Dmytro","Hrinchenko","Male");
        person1.name("Dmytro",23,5625897);
        person1.name("Dmytro","Hrinchenko",23);
        person1.name("Dmytro","Hrinchenko",5625897,23);
        person1.name("Dmytro",23,"Male");
    }
}
