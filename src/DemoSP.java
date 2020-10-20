import java.util.Stack;

public class DemoSP {
	public static void main(String[] args) {
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(4);
		
		g.addEdge(new DirectedEdge(0, 1, 1.0)); // 0 -> 1 lenght 1.0
		g.addEdge(new DirectedEdge(2, 1, 2.0));
		g.addEdge(new DirectedEdge(2, 0, 2.5));
		g.addEdge(new DirectedEdge(3, 2, 1.5));
		
		DijkstraSP dij = new DijkstraSP(g, 3);
		
		System.out.println(dij.distTo(1));
		Stack<DirectedEdge> st = dij.pathTo(1);
		System.out.print(3);
		while(!st.isEmpty()) {
			DirectedEdge e = st.pop();
			System.out.print(" -> " + e.to());
		}
	}
}
