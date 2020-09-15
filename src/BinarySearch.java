import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Student> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			Student s = new Student(kb.next(),kb.next());
			arr.add(s);
		}
		
		String sortBy = kb.next();
		String value = kb.next();
		int index = 0;
		
		switch(sortBy) {
		case "id": Collections.sort(arr,Student.idComparator);
				index = Collections.binarySearch(arr,new Student(value,null),Student.idComparator);
				if(index<0) {
					System.out.println("not found");
				}else {
					System.out.println("found");
				}
				break;
		case "name": Collections.sort(arr,Student.nameComparator);
				index = Collections.binarySearch(arr,new Student(null,value),Student.nameComparator);
				if(index<0) {
					System.out.println("not found");
				}else {
					System.out.println("found");
				}
				break;
		}
	}
}

class Student {
	private String id;
	private String name;
	
	public Student(String id,String name) {
		this.id = id;
		this.name = name;		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static Comparator<Student> idComparator = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			String id1 = s1.getId();
			String id2 = s2.getId();
			
			return id1.compareTo(id2);
		}
	};
	
	public static Comparator<Student> nameComparator = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			String name1 = s1.getName();
			String name2 = s2.getName();
			
			return name1.compareTo(name2);
		}
	};

}

