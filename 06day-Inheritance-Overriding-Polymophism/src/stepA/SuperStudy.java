package stepA;

public class SuperStudy {
	public static void main(String[] args) {
		Drink d = new Drink("��", 1000);
		Coffee c = new Coffee("�Ƹ޸�ī��",3200,"�̵��");
		Juice j = new Juice("��Ű��Ʈ",1800,"������");
		Alcohol a = new Alcohol("���̽�",1440,17);
		
		System.out.println("-------1�ܰ�--------");
		d.printDrink();
		c.printCoffee();
		j.printJuice();
		a.printAlcohol();
		
		System.out.println("-------2�ܰ�--------");
		System.out.println(d.getDetails());
		System.out.println(j.getDetails());
		System.out.println(c.getDetails());
		System.out.println(a.getDetails());
	}
	
}
