package step2;
// Student has a Notebook
public class TestAggregation2 {
	public static void main(String[] args) {
		NoteBook n = new NoteBook("samsung", "white");
		Student s = new Student();
		
		s.setName("�ں���");
		
		//NoteBook datatype n��
		//student�� ���� notebook ��ü��
		//���� �ּҰ��� ����Ű��, �� ������ ��ü�̴�.
		s.setNoteBook(n);
		System.out.println(s.getNoteBook());
		
		//�ں��� �л��� ������ ��Ʈ���� ������ black���� �����Ѵٸ�
		s.getNoteBook().setColor("black");
		System.out.println(s.getNoteBook().getColor());
	}
}
