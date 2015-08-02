package info.iridiumcao.hellojavase.collection.listsort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * for https://sites.google.com/site/iridiumsite/it/java/java-lang/sort-list
 */
public class Client1 {
    public static void main(String[] args) {
        Person p1 = new Person("Zhang San", 30, "zhangsan@hotmail.com");
        Person p2 = new Person("Li Si", 29, "lisi@gmail.com");
        Person p3 = new Person("Wang Wu", 100, "wangwu@yahoo.com");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Person p : list) {
            System.out.println(p);
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge(); // “‘ƒÍ¡‰≈≈–Ú
            }

        });

        for (Person p : list) {
            System.out.println(p);
        }
    }

}
