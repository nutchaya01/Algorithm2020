import java.util.Scanner;

public class Recursive {
	static int sum=0;
	public static int Koon(int x,int y) {
		sum+=x;
		System.out.println(x+" x "+y+" = "+sum);
		if(y==12) {
			return x;
		}else {
			return x+Koon(x,y+1);
		}
	
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		Koon(x,1);

	}

}
