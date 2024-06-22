package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLogic {
	
	HashMap<Integer, ArrayList<Integer>>nodes;
	int root;
	public GraphLogic() {
		nodes = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void insert(int node,int edge) {
		if(nodes.keySet().size()==0) {
			 root = node;
			 System.out.println("root : "+node);
		}
		if(nodes.get(node) == null) {
			ArrayList<Integer>values=new ArrayList<Integer>();
			values.add(edge);
			System.out.println("node : "+node);
			nodes.put(node, values);
			
		}
		else {
			ArrayList<Integer>values = nodes.get(node);
			values.add(edge);
			System.out.println("node : "+node+" size:"+values.size());
			nodes.put(edge, new ArrayList<Integer>());
		}
	}
	
	public void bfs() {
		Queue<Integer>queue = new LinkedList<Integer>();
		HashMap<Integer, Integer>visited= new HashMap<Integer, Integer>();
		
		visited.put(root, 1);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.println("BFS :"+currentNode);
			for(int child: nodes.get(currentNode)) {
				if(!visited.keySet().contains(child)|| visited.get(child)!=1) {
					visited.put(child, 1);
					queue.add(child);
				}
			}		
		}
	}
	
	public void dfs() {
		HashMap<Integer, Integer>visited = new HashMap<Integer, Integer>();
		dfs(root,visited);
	}
	
	public void dfs(Integer currentNode,HashMap<Integer, Integer>visited) {
		visited.put(currentNode, 1);
		System.out.println("dfs: "+currentNode);
		for(int child: nodes.get(currentNode)) {
			if(!visited.keySet().contains(child)||visited.get(child)!= 1) {
				dfs(child,visited);
			}
		}		
	}
}