package model;

public class Student extends Member{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stuId;

	public Student(String tel, String name, String address, String stuId) {
		super(tel, name, address);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return super.toString()+" "+"[stuId=" + stuId + "]";
	}
	
}
