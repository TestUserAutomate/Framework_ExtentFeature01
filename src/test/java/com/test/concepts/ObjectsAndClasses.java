package com.test.concepts;

public class ObjectsAndClasses {
	int a= 5;
	public void show(){
		
		System.out.println("show method displayed");
	}

	public static void main(String[] args) {
		// obj is a reference in created in the stack memory pointing to the Heap memory where Object is created
		ObjectsAndClasses obj = new ObjectsAndClasses();
	obj.show();

	}

}
