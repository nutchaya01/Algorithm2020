import java.util.Scanner;

public class powerMod {
	public static int mod (int a,int b,int c) {
		int x = 0;
		if(b==0) 
			return 1;
		
		if(b%2==0) {
			x = mod(a,b/2,c);
			return (x*x)%c;
		}else {
			x = mod(a,b/2,c);
			return (a*(x*x))%c;
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for (int i=0;i<n;i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			System.out.println(mod(a,b,c));
		}

	}

}
