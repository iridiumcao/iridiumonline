package info.iridiumcao.hellojavase.collection.listsort1;

/**
 * for https://sites.google.com/site/iridiumsite/it/java/java-lang/sort-list
 */
public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String email;

    public Person() {

    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name + ": " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

}