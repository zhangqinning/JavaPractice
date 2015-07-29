

public class Node {


	private char val;
	private Node L;
	private Node R;
	public Node(char i,Node l,Node r){
	    this.val=i;
		this.L=l;
		this.R=r;
	}
	public Node(char i){
		this.val=i;
		this.L=null;
		this.R=null;
	}
	public char getKey(){
		return val;
	}
	public Node getLeft(){
		return L;
	}
	public Node getRight(){
		return R;
	}
	
	

}
