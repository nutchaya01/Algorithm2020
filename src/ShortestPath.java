import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ShortestPath {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(m);
		
		for(int i=0;i<m;i++) {
			g.addEdge(new DirectedEdge(kb.nextInt(),kb.nextInt(),kb.nextDouble())); 
		}
		
		int s = kb.nextInt();
		DijkstraSP dij = new DijkstraSP(g, s);
		
		for(int i=0;i<n;i++) {
			if(dij.distTo(i+1) != Double.POSITIVE_INFINITY) {
				System.out.print(s+" to "+(i+1)+" ( ");
				System.out.printf("%.2f",dij.distTo(i+1));
				System.out.print("): ");
				Stack<DirectedEdge> st = dij.pathTo(i+1);
				System.out.print(s);
				while(!st.isEmpty()) {
					DirectedEdge e = st.pop();
					System.out.print(" -> " + e.to());
				}
			}
			System.out.println();
		}

	}
}
