package step6;
//toString �޼ҵ带 �������̵��Ͽ� ���

class Food{
	String menu;
	int price;
	Food(String menu, int price){
		this.menu = menu;
		this.price = price;
	}
	//toString�� Ȱ���Ͽ� �ش� ��ü�� �Ӽ������� return
	public String toString() {
		return menu;
		}
	
}

public class TestObject2 {
	//point : ��ü�ּҰ��� �ƴ�, �Ӽ������� return �ϴ� ���
	public static void main(String[] args) {
		Food f = new Food("���İ�Ƽ", 9000);
		System.out.println(f.toString());
		System.out.println(f);
		//f ȣ��� ���������� toString �޼ҵ� ȣ��
		//�ش� �޼ҵ�� �������̵��Ͽ� �������Ͽ���
		//return menu�� ���� �ش� ��ü�� �Ӽ����� return

	}
}
