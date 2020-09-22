import java.util.Scanner;

public class ClosestPair {
	public static void closest(Point parr[]) {
		// **devide**
		//X<0 X>=0 separate middle
		//P1,P2 set of left-right
		//closestP1 return d1
		//closestP2 return d2
		
		// **merge**
		// d = min(d1,d2)
		//
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		
		int Q = kb.nextInt();
		for (int i=0;i<Q;i++) {
			int N = kb.nextInt();
			Point arr[] = new Point[N];
			for(int j=0;j<N;j++) {
				int x = kb.nextInt();
				int y = kb.nextInt();
				Point p = new Point(x,y);
				arr[j] = p;
			}
			closest(arr);
		}
		
		

	}

}
class Point{
	int x;
	int y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = "+x+", y = "+y;
	}
	
}
