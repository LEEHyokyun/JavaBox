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
		return noteBook; //�����δ� �ش� ��ü�� "�ּҰ�"�� return.
	}
	//���� �Ű������� ���� ��ü�� ���޵� ��� �⺻������ dataType ��ġ
	//����� Ȱ���� ���, �θ� type�� ��ü�� ���� ����������.
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
}
