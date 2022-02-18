package step1;

class GrandParent{
	//super class extends "Object"
	GrandParent(){
		//java.lang.Object
	}
}

class Parent extends GrandParent{
	//super must be at the first line
}

class Child extends Parent{
	//Inheritance
	//super() is in it, regardless that you write it.
	Child(){
		super();
	}
}

public class TestInheritanceReview {
	public static void main(String[] args) {
		new Child();
	}
}
