package miage.algo;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int id;
	private List<Arc> arcs;
	public List<Arc> getArcs() {
		return arcs;
	}

	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}

	private boolean visited;
	private Node root;
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node(int id){
		this.id = id;
		this.arcs = new ArrayList<Arc>();
		this.setVisited(false);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString(){
		String result = id+" ";
		for (int i=0;i<this.arcs.size();i++){
			result += this.arcs.get(i).toString();
		}
		return result;
	}
	
	public boolean equals(Node other){
		if (other.getId() == this.id)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
