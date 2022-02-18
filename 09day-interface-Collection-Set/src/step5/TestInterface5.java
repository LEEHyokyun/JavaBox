package step5;
//interface skills
class A{}
class B{}
//class C extends A, B{} //only allowed single extend

interface Ex1{
	public void ex1();
}
interface Ex2{
	public void ex2();
}
class ExImpl extends A implements Ex1, Ex2{
	//extending and implement could be used with each other.
	public void ex1() {}; //구현한 그대로 상속받았으므로 따로 구현할 필요는 없다.
	public void ex2() {};
}

class SubExImpl extends ExImpl{}
//SubExImpl 역시 최종적으로는 부모class, interface를 가지는 것과 동일!
//즉 모든 상위인터페이스와 부모클래스의 기능과 성격을 상속받는

interface D{
	public void d();
}

interface E{
	public void e();
}

interface Test extends D,E{
	public void t();
}//interface간의 다중 상속 가능!}
//interface는 multiple implements가 가능!

class TestImpl implements Test{
	//다중상속한 interface를 구현한 class
	//그대로 해당 메소드를 "구현"받아 모두 구현해야함
	public void d() {} //D
	public void e() {} //E
	public void t() {} //Test interface
	// all of abstract method should be implemented in this class.
}

public class TestInterface5 {
	public static void main(String[] args) {
		A a = new ExImpl();
		Ex1 ex1 = new ExImpl();
		
		Ex1 s1 = new SubExImpl();
		Ex2 s2 = new SubExImpl();
	}
}
