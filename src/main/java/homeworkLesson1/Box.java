package homeworkLesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> arrayList;

    public Box() {
        this.arrayList = new ArrayList<>();
    }

    public Box(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public float getWeight() {
        return arrayList.size() * arrayList.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void add(T element) {
        arrayList.add(element);
    }

    public void addAll(Box<T> otherBox) {
        otherBox.getArrayList().addAll(arrayList);
        this.arrayList.clear();
    }

    public String info() {
        if (!arrayList.isEmpty()) {
            return "The box contains " + this.toString() + " in quantity:" + arrayList.size();
        }
        return "The box is empty";
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    @Override
    public String toString() {
        return arrayList.get(0).toString() + "Box ";
    }
}
