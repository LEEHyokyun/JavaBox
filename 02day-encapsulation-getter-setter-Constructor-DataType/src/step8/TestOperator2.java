package step8;

class OperatorExam{
	public boolean test1(){
		System.out.println("test1");
		return false;
	}
	public boolean test2(){
		System.out.println("test2");
		return true;
	}
}
public class TestOperator2 {
	public static void main(String[] args) {
		OperatorExam oe = new OperatorExam();
		
		System.out.println(oe.test1()&&oe.test2());
		System.out.println("*****");
		System.out.println(oe.test1()&oe.test2());
	}
}
