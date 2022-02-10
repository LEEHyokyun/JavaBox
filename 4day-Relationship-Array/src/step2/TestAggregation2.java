package step2;
// Student has a Notebook
public class TestAggregation2 {
	public static void main(String[] args) {
		NoteBook n = new NoteBook("samsung", "white");
		Student s = new Student();
		
		s.setName("박보검");
		
		//NoteBook datatype n과
		//student가 가진 notebook 객체는
		//같은 주소값을 가르키는, 즉 동일한 객체이다.
		s.setNoteBook(n);
		System.out.println(s.getNoteBook());
		
		//박보검 학생이 소유한 노트북의 색상을 black으로 변경한다면
		s.getNoteBook().setColor("black");
		System.out.println(s.getNoteBook().getColor());
	}
}
