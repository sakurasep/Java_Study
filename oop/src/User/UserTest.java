package User;

import java.util.Objects;

/**
 * @author sakurasep
 * * @date 2024/3/19
 **/
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User(10, "lihua");
        User u2 = new User(10, "xiaoli");
        User u3 = new User(10,"lihua");
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.toString());
    }
}



class User {
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj instanceof User) {
//            User user = (User) obj;
//            return this.age == user.age && this.name.equals(user.name);
//        }
//
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

//    @Override
//    public String toString() {
//        return "Use r" + "name: " + name + " age: " + age;
//    }


    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
