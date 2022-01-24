package homeclass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Animal> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        list.add(cat);
        list.add(dog);
        list.add(cow);
        //foo(list);
    }

    public static void foo(List<? extends Animal> list) {
        list.forEach(e -> System.out.println(e.name)); //вверхняя граница
    }

    public static void bar(List<? super Animal> list) {
        list.add(new Dog()); //нижняя граница
    }
}
