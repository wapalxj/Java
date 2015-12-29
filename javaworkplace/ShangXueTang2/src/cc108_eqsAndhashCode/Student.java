package cc108_eqsAndhashCode;

public class Student {
	private int id;
	private String name;
	
	/**
	 * hashCode equals����һ�㲻��Ҫ��д�������������
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
