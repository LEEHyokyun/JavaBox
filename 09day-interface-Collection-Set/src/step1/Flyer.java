package step1;

public interface Flyer {
	String ID = "FD123JAVA"; //public static final, 즉 metaspace에 저장되는 클래스변수(상수)
	public void fly();
		//abstract method
		//구현부 생성 불가
}
