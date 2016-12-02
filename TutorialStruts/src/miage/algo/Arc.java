package miage.algo;

public class Arc {
	private int id;
	private Node pred;
	private Node succ;
	private double val;
	
	public Arc(int id, Node pred, Node succ, int val){
		this.id = id;
		this.pred = pred;
		this.succ = succ;
		this.val = val;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getPred() {
		return pred;
	}

	public void setPred(Node pred) {
		this.pred = pred;
	}

	public Node getSucc() {
		return succ;
	}

	public void setSucc(Node succ) {
		this.succ = succ;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
	
	public String toString(){
		return this.pred.getId() + "--"
				//+this.val
				+"-->"+this.succ.getId();
	}
}
