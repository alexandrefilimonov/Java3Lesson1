package ru.geekbrains.Lesson1;

class Orange extends Fruit{
    protected static double weight;
    public Orange(String name, double dOrangeWeight){
        this.fruitName = name;
        this.weight = dOrangeWeight;
    }
    static double getOrangeWeight() {
        return weight;
    }
}




