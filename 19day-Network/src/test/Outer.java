package test;

import java.util.ArrayList;

public class Outer {
	private int money = 100;
	private ArrayList<Inner> list = new ArrayList<Inner>();
	
	public void accessTest() {
		list.add(new Inner());
		list.add(new Inner());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).message);
		}
		//System.out.println(message);
	}
	
	public class Inner{
		private String message = "�޽���";
		public void test() {
			System.out.println("money");
			//outer class�� private member�� money�� ���ٰ���
		}
	}
}
