package Person;

/**
 * @author sakurasep
 * * @date 2024/3/13
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.walk();

        Man man = new Man();
        man.eat();
        man.walk();

        Woman woman = new Woman();
        woman.eat();
        woman.walk();

        System.out.println("*********多态性********");

        Person person1 = new Man();
        person1.eat();
        person1.walk();

        Person person2 = new Woman();
        person2.eat();
        person2.walk();

    }

}
