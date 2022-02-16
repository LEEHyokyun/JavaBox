package step1;

class Fish{
	int count;
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1 = new Fish(); //생성자초기화 및 호출로 인해 각각 1씩 증가됨
		System.out.println(f1.count); //별도의 f1에서 0->1 
		System.out.println(f1.sCount); //static이라도 동일하게 Fish class를 통해 metasapce로 접근
		System.out.println(Fish.sCount); //붕어빵틀 차원에서 0->1
		
		Fish f2 = new Fish();
		System.out.println(f2.count); //별도의 f2에서 0->1
		System.out.println(Fish.sCount); //붕어빵틀 차원에서 1->2
	}
}

/*
 * Fish class loading 시점에서 이미 Fish 클래스를 생성하고, metaspace에 static 변수를 저장한다.
 * 
 */