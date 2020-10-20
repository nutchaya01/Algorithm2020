import java.util.Stack;

public class DemoSP {
	public static void main(String[] args) {
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(7);
		
		g.addEdge(new DirectedEdge(0, 1, 1.0)); // 0 -> 1 length 1.0
		g.addEdge(new DirectedEdge(2, 1, 2.0));
		g.addEdge(new DirectedEdge(2, 0, 2.5));
		g.addEdge(new DirectedEdge(3, 2, 1.5));
		
		DijkstraSP dij = new DijkstraSP(g, 3); //start from 1
		
		System.out.println(dij.distTo(1)); // distance
		Stack<DirectedEdge> st = dij.pathTo(1); //path
		System.out.print(3); // start
		while(!st.isEmpty()) {
			DirectedEdge e = st.pop();
			System.out.print(" -> " + e.to());
		}
	}
}
