package ru.geekbrains.Lesson1;

class Apple extends Fruit{
    protected static double weight;
    public Apple(String name, double dAppleWeight){
        this.fruitName = name;
        this.weight = dAppleWeight;
    }
	static double getAppleWeight() {
        return weight;
    }

}




