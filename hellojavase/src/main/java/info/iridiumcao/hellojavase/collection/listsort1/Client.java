package info.iridiumcao.hellojavase.collection.listsort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * for https://sites.google.com/site/iridiumsite/it/java/java-lang/sort-list
 */
public class Client {
    public static void main(String[] args) {
        Person p1 = new Person("Zhang San", 30, "zhangsan@hotmail.com");
        Person p2 = new Person("Li Si", 29, "lisi@gmail.com");
        Person p3 = new Person("Wang Wu", 100, "wangwu@yahoo.com");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.forEach(System.out::println);

        Collections.sort(list);

        list.forEach(System.out::println);
    }

}
