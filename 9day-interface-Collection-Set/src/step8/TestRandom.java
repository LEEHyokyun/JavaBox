package step8;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(3)); //range 0~3
		System.out.println("*****************");
		System.out.println(r.nextInt(100)); //range 0~100
		System.out.println("*****************");
		for(int i=0;i>10;i++) {
			System.out.println(r.nextInt(100));
		}
	}
}
