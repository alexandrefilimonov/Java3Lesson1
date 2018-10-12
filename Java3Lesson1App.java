package ru.geekbrains.Lesson1;
import java.util.*;

public class Java3Lesson1App{
    public static void main( String [] args ) {
    	//1.Method to excahnge elements in array of ANY reference type
		System.out.println("\nTASK #1:");
		String[] a1 = {"1","2","3"};
		System.out.println("Array content before exchange: "+a1[0]+" "+a1[1]+" "+a1[2]);
		ElementsExchange t = new ElementsExchange(a1);
		t.echange(0,2);
		System.out.println("Array content after exchange: "+a1[0]+" "+a1[1]+" "+a1[2]);

    	//2.Method to convert array to ArrayList
		System.out.println("\nTASK #2:");
		ArrayToArrayList aa = new ArrayToArrayList(a1);
		ArrayList<String> al = aa.convertArrayToArrayList();
		System.out.println("Array list made from array: "+al);

		//3.Fruit busket task
		System.out.println("\nTASK #3:");
		Apple a = new Apple("apple", 1.0f);
		Orange o = new Orange("orange", 1.5f);

		double dWeightOfBusket = 34.7f;
		Box box1 = new Box(dWeightOfBusket);
		Box box2 = new Box(dWeightOfBusket);
		Box box3 = new Box(dWeightOfBusket);

		while (true) {
			// Adding max qty of aaples to the backet #1
			if (box1.addFruit("apple",1)) { }
			else {
				System.out.println("The Basket#1 is full by apples and has the weight "+box1.getWeight());
				break;
			}
		}
		while (true) {
			// Adding max qty of oranges to the backet #2
			if (box2.addFruit("orange",1)) { }
			else {
				System.out.println("The Basket#2 is full by oranges and has the weight "+box2.getWeight());
				break;
			}
		}
		if (box1.Compare(box2)) System.out.println("The Basket#1 and Basket#1 are equal by weight");
		else System.out.println("The Basket#1 and Basket#1 are NOT equal by weight!");

		System.out.println("\nTryting to move apples from Basket#1 to Basket #2!");
		box1.MoveContent(box2);
		System.out.println("\nTryting to move apples from Basket#1 to Basket #3!");
		box1.MoveContent(box3);
		System.out.println("\nTryting to move oranges from Basket#2 to Basket #1!");
		box2.MoveContent(box1);
    }
    public ArrayList convertArrayToArrayList(String [] array) {
    	ArrayList a = null;
    	return a; //ArrayList<Element>(Arrays.asList(array));
	}
}
