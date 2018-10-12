package ru.geekbrains.Lesson1;

public class ElementsExchange<T> {
    private T[] obj;
    int n1;
    int n2;

    public ElementsExchange(T[] obj1) {
        this.obj = obj1;
    }
    public void echange(int n1, int n2) {
        Object temp =this.obj[n1];
        this.obj[n1]=this.obj[n2];
        this.obj[n2]=(T)temp;
    }
}
