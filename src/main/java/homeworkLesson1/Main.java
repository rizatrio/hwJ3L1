package homeworkLesson1;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //task1
        Integer[] arrInt = {1, 2, 4, 7, 8, 15, -6 , 0};
        String[] arrString = {"Asia", "Europa", "America", "Australia", "Africa"};

        System.out.println("Before: " + Arrays.toString(arrInt));
        swapTwoElements(arrInt, 4, 0);
        System.out.println("After: " + Arrays.toString(arrInt));


        System.out.println("Before: " + Arrays.toString(arrString));
        swapTwoElements(arrString, 1, 3);
        System.out.println("After: " + Arrays.toString(arrString));

        //task2
        System.out.println(arrInt.getClass().getName());
        System.out.println(convertToArrayList(arrInt).getClass().getName());


        //task3
        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(3.0f);

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < 3; i++) {
            appleBox.add(apple);
            appleBox2.add(apple);
        }

        for (int i = 0; i < 4; i++) {
            orangeBox.add(orange);
        }

        System.out.println("The weight of the box with apples: " + appleBox.getWeight());
        System.out.println("The weight of the box 2 with apples: " + appleBox2.getWeight());
        System.out.println("The weight of the box with oranges: " + orangeBox.getWeight());

        System.out.println("Compare weight:" + appleBox.toString() + orangeBox.toString() + appleBox.compare(orangeBox));
        System.out.println("Compare weight:" + appleBox.toString() + appleBox2.toString() + appleBox.compare(appleBox2));


        appleBox.addAll(appleBox2);
        orangeBox.add(orange);

        System.out.println(appleBox.info());
        System.out.println(appleBox2.info());
        System.out.println(orangeBox.info());

    }

    //task1
    public static <T> void swapTwoElements( T[] arr, int firstIndex, int secondIndex) {
        T tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }

    //task2
    public static <T> List<T> convertToArrayList(T[] arr) {
        return Arrays.asList(arr);
    }

}
