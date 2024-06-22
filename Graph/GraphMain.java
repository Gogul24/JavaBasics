package Graph;

public class GraphMain {

	public static void main(String[] args) {
		GraphLogic graph = new GraphLogic();
		
		graph.insert(0, 2);
		graph.insert(0, 1);
		graph.insert(0, 3);
		graph.insert(2, 6);
		graph.insert(1, 5);
		graph.insert(3, 4);
		
		graph.dfs();
	}
}
