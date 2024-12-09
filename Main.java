import java.util.*;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ishrat", 30);
        Person p2 = new Person("Barsha", 30);
        Person p3 = new Person("Safa", 25);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println("HashCode of p1: " + p1.hashCode());
        System.out.println("HashCode of p2: " + p2.hashCode());
        System.out.println("HashCode of p3: " + p3.hashCode());

        Map<Person, String> personMap = new HashMap<>();
        personMap.put(p1, "Engineer");
        personMap.put(p3, "Designer");

        System.out.println("Job of p1: " + personMap.get(p1));
        System.out.println("Job of p2 (equal to p1): " + personMap.get(p2));
        System.out.println("Job of p3: " + personMap.get(p3));
    }
}
