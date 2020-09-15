import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		Library[] lib = new Library[n];
		
		char how = kb.next().charAt(0);
		String what = kb.next();
		
		for(int i=0;i<lib.length;i++) {
			lib[i] = new Library(kb.next(),kb.next(),kb.nextDouble());
		}
		
		if (what.equals("id")) {
			if(how=='a') {
				Arrays.sort(lib, Library.IdComparator);
			}else if(how=='d') {
				Arrays.sort(lib, Library.IdComparator.reversed());
			}
		}else if (what.equals("name")) {
			if(how=='a') {
				Arrays.sort(lib, Library.NameComparator);
			}else if(how=='d') {
				Arrays.sort(lib, Library.NameComparator.reversed());
			}
		}else if (what.equals("gpa")) {
			if(how=='a') {
				Arrays.sort(lib, Library.GpaComparator);
			}else if(how=='d') {
				Arrays.sort(lib, Library.GpaComparator.reversed());
			}
		}
		
		
		int i = 0;
		for (Library temp : lib) {
			System.out.println(temp.getId()+" "+ temp.getName()+" "+ temp.getGpa());
		}

	}

}

class Library implements Comparable<Library> {
	private String id;
	private String name;
	private double gpa;

	public Library(String id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public int compareTo(Library compareLibrary) {
		return 0;
		//int compareQuantity = ((Fruit) compareFruit).getQuantity();

		// ascending order
		//return this.quantity - compareQuantity;

		// descending order
		// return compareQuantity - this.quantity;
	}

	public static Comparator<Library> NameComparator = new Comparator<Library>() {

		public int compare(Library stu1, Library stu2) {

			String name1 = stu1.getName().toUpperCase();
			String name2 = stu2.getName().toUpperCase();

			// ascending order
			return name1.compareTo(name2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};
	
	public static Comparator<Library> IdComparator = new Comparator<Library>() {

		public int compare(Library stu1, Library stu2) {

			String id1 = stu1.getId();
			String id2 = stu2.getId();

			// ascending order
			return id1.compareTo(id2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};
	
	public static Comparator<Library> GpaComparator = new Comparator<Library>() {

		public int compare(Library stu1, Library stu2) {

			double gpa1 = stu1.getGpa();
			double gpa2 = stu2.getGpa();
			
			if(gpa1>gpa2) return 1;
			if(gpa1<gpa2) return -1;
			return 0;

			// ascending order
			//return gpa1.compareTo(gpa2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};

}