package step5;

public class ForLoopService {
	public void printInfo(String item, int count) {
		for(int start=1; start<count; start++) {
			System.out.println(item+" "+start+"ÀÜ");
		}
	}

	public void printInfo2(String item, int count, int limit) {
		for(int i=1;i<count;i++) {
			System.out.println(item+" "+i+"ÀÜ");
			if(i == limit) break;
		}
	}
}
