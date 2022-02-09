package step6;

public class Mydate {
	private int day1;
	private int day2 = 22;
	private boolean flag; //기본 초기화 false
	private String name; // 기본 초기화 null
	
	public Mydate(int day2) {
		this.day2=day2;
	}
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay1() {
		return day1;
	}
	public void setDay1(int day1) {
		this.day1 = day1;
	}
	public int getDay2() {
		return day2;
	}
	public void setDay2(int day2) {
		this.day2 = day2;
	}
}
