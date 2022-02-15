package step5;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		service.printDetailInfo(new Manager("1","아이유",500,"연구개발"));
		service.printDetailInfo(new Employee("2","강하늘",600));
		service.printDetailInfo(new Engineer("3","제임스고슬링",800,"자바"));
	}
}
