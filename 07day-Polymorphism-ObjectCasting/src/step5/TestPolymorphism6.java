package step5;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		service.printDetailInfo(new Manager("1","������",500,"��������"));
		service.printDetailInfo(new Employee("2","���ϴ�",600));
		service.printDetailInfo(new Engineer("3","���ӽ�����",800,"�ڹ�"));
	}
}
