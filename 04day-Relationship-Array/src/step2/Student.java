package step2;

public class Student {
	private String name;
	//student has a notebook
	private NoteBook noteBook;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NoteBook getNoteBook() {
		return noteBook; //실제로는 해당 객체의 "주소값"을 return.
	}
	//참조 매개변수를 통해 객체가 전달될 경우 기본적으로 dataType 일치
	//상속을 활용할 경우, 부모 type의 객체도 전달 가능해진다.
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
}
