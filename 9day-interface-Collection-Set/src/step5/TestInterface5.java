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
	public void ex1() {}; //������ �״�� ��ӹ޾����Ƿ� ���� ������ �ʿ�� ����.
	public void ex2() {};
}

class SubExImpl extends ExImpl{}
//SubExImpl ���� ���������δ� �θ�class, interface�� ������ �Ͱ� ����!
//�� ��� �����������̽��� �θ�Ŭ������ ��ɰ� ������ ��ӹ޴�

interface D{
	public void d();
}

interface E{
	public void e();
}

interface Test extends D,E{
	public void t();
}//interface���� ���� ��� ����!}
//interface�� multiple implements�� ����!

class TestImpl implements Test{
	//���߻���� interface�� ������ class
	//�״�� �ش� �޼ҵ带 "����"�޾� ��� �����ؾ���
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
