package stepA;

public class SuperStudy {
	public static void main(String[] args) {
		Drink d = new Drink("물", 1000);
		Coffee c = new Coffee("아메리카노",3200,"이디야");
		Juice j = new Juice("썬키스트",1800,"오렌지");
		Alcohol a = new Alcohol("참이슬",1440,17);
		
		System.out.println("-------1단계--------");
		d.printDrink();
		c.printCoffee();
		j.printJuice();
		a.printAlcohol();
		
		System.out.println("-------2단계--------");
		System.out.println(d.getDetails());
		System.out.println(j.getDetails());
		System.out.println(c.getDetails());
		System.out.println(a.getDetails());
	}
	
}
