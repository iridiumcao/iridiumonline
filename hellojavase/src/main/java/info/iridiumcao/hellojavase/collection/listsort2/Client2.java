package info.iridiumcao.hellojavase.collection.listsort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * for https://sites.google.com/site/iridiumsite/it/java/java-lang/sort-list
 * 本例应用 Java 8 的 lambda 表达式以及 forEach 循环
 */
public class Client2 {
    public static void main(String[] args) {
        Person p1 = new Person("Zhang San", 30, "zhangsan@hotmail.com");
        Person p2 = new Person("Li Si", 29, "lisi@gmail.com");
        Person p3 = new Person("Wang Wu", 100, "wangwu@yahoo.com");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.forEach(System.out::println);

        Collections.sort(list, (o1, o2) -> {
            return o1.getAge() - o2.getAge(); // 以年龄排序
        });

        list.forEach(System.out::println);
    }
}
