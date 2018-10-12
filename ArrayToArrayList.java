package ru.geekbrains.Lesson1;
import java.util.*;

public class ArrayToArrayList<T> {
    private T[] obj;
    private ArrayList<T> arrayList;

    public ArrayToArrayList(T[] obj1) {
        this.obj = obj1;
    }
    public ArrayList convertArrayToArrayList() {
        arrayList = new ArrayList<T>(Arrays.asList(obj));
        return arrayList;
    }
}
