package step5;

public class TestInheritance2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.study(); //가능
		p.eat(); //가능
		//System.out.println(p.age); //접근제한자가 private이므로 접근불가!
		//상속받았더라도 class가 다르므로 private member는 접근불가
		
		/*
		 * 부모의 setter, getter 활용하면 접근가능
		 */
		p.setAge(11);
		p.getAge();
		//부모의 public method는 부모객체생성없이 바로 사용가능!
		//다만 private 한해서는 직접 사용은 불가능!
	}
}
