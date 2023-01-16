package generic_004_wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {//일반인과정
		this.name = name;//일반인과정
		students = (T[]) (new Object[capacity]);//펄슨배열로 5
	}

	public String getName() { return name; }
	public T[] getStudents() { return students; }
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
