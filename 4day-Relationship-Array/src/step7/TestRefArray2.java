package step7;

//�ٸ� ��Ű������ person class import ����!
import step6.Person;

public class TestRefArray2 {
	public static void main(String[] args) {
		//�迭 ���� ���� �Ҵ� ���ÿ�
		Person[] pa = {
				new Person("���ϴ�",34),
				new Person("�ں���",28),
				new Person("���缮",50)
		};
		int age=30;
		//30�� �ʰ��ϴ� Person name , age�� ���
		for(int i=0;i<pa.length;i++) {
			if(pa[i].getAge()>30) {
				System.out.print(pa[i].getName() + "\t");
				System.out.print(pa[i].getAge());
				System.out.println();
			}
		}
		
	}
}
