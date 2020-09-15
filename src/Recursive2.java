import java.util.Scanner;

public class Recursive2 {
	public static String binary(int x) {
		if(x==0 || x==1) {
			return ""+x;
		}else {
			return binary(x/2)+x%2;
		}
		
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		System.out.println(binary(x));

	}

}
