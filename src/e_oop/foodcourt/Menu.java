package e_oop.foodcourt;

import java.util.Random;

public class Menu {
	String name;
	int price;
	int cookingTime;
	
	public Menu(String name, int price) {
		this.name = name; 
		this.price = price;
		this.cookingTime = new Random().nextInt(10)+1;
	}
	
	public String toString() {
		return String.format("[%6d원] %10s - %d초", this.price, this.name, this.cookingTime);
	}
}
