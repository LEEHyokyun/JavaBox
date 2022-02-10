package step4;

public class TestHasA {
	public static void main(String[] args) {
		School school = new School("천천초등학교");
		System.out.println(school.getName());
		//구조적으로는 has a 
		//개념적으로는 consist of
		school.setBus(new Bus("현대자동차",30));
		System.out.println(school.getBus().getMaker());
		System.out.println(school.getBus().getCount());
	}
}
