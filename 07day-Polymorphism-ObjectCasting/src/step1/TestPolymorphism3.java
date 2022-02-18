package step1;

public class TestPolymorphism3 {
	public static void main(String[] args) {
		ZooService zooservice = new ZooService();
		zooservice.pass(new Person());
	}
}
