package ru.geekbrains.Lesson1;
import java.util.*;

public class Box {
    protected String fruitNameInBox;
    protected ArrayList box;
    protected int qtyFruits;
    protected double dCurrentWeight;
    protected double dMaxWeight;

    public Box(double dMaxWeight){
        this.dMaxWeight = dMaxWeight;
        this.dCurrentWeight = 0.0f;
        this.fruitNameInBox="";
    }
    //Trying to add qty of certain fruits to the backet
    public boolean addFruit(String name, int qtyFruits) {
        if (name=="apple"){
            if ((this.dCurrentWeight+qtyFruits*Apple.getAppleWeight())<=this.dMaxWeight) {
                this.dCurrentWeight+=qtyFruits*Apple.getAppleWeight();
                this.qtyFruits+=qtyFruits;
                this.fruitNameInBox=name;
                return true;
            }
            else {
                return false;
            }
        }
        else if (name=="orange") {
            if ((this.dCurrentWeight+qtyFruits*Orange.getOrangeWeight())<=this.dMaxWeight) {
                this.dCurrentWeight+=qtyFruits*Orange.getOrangeWeight();
                this.qtyFruits+=qtyFruits;
                this.fruitNameInBox=name;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            System.out.println("Sombody tries to add unknon fruit to basket! It's forbidden!");
            return false;
        }
    }
    //Compare two backets by weights
    public boolean Compare(Box b) {
        if (this.dCurrentWeight==b.getWeight()) {
            return true;
        }
        else {
            return false;
        }
    }
    //Try to move oranges and apples from current backet to the basket passed by parameter
    public boolean MoveContent(Box b) {
        if (this.fruitNameInBox==b.fruitNameInBox || b.fruitNameInBox=="" || this.fruitNameInBox=="") {
            //same fruits and backets are not empty, trying to move fruits
            if (b.addFruit(this.fruitNameInBox, this.qtyFruits)) {
                this.emptyBox();
                System.out.println("Moving of the fruits was successful!");
                System.out.println("After completion the weight of the basket from where fruits were moved out is "+this.getWeight());
                System.out.println("After completion the weight of the basket to where fruits were moved out is "+b.getWeight());
                return true;
            }
            else {
                System.out.println("Moving of the fruits was not successful!");
                return false;
            }
        }
        else {//different fruits
            System.out.println("Fruits in backets are different. It's forbidden to mix fruits!");
            return false;
        }
    }
    //Get the current weight of the backet
    public double getWeight() {
        return this.dCurrentWeight;
    }
    //Empty the basket
    public void emptyBox() {
        this.qtyFruits=0;
        this.fruitNameInBox="";
        this.dCurrentWeight=0.0f;
    }
}
