import java.util.Stack;


public class BinaryTree {
		
	protected Node root;
	public BinaryTree(Node root){
		this.root=root;
	}
	public Node getRoot(){
		return root;
	}

	public static Node init() {  
        Node a = new Node('A');  
        Node b = new Node('B', null, a);  
        Node c = new Node('C');  
        Node d = new Node('D', b, c);  
        Node e = new Node('E');  
        Node f = new Node('F', e, null);  
        Node g = new Node('G', null, f);  
        Node h = new Node('H', d, g);  
        return h;// root  
    }
	
	public static void visit(Node p){
		System.out.print(p.getKey()+"");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree(init());
		System.out.print(" Pre-Order: ");
		preorder(tree.getRoot());
		System.out.println();
		
		System.out.print(" In-Order: ");
		inorder(tree.getRoot());
		System.out.println();
		
		System.out.print(" Post-Order: ");
		postorder(tree.getRoot());
		System.out.println();			
	}
		
	/**µ›πÈ œ»–Ú*/
	protected static void preorder(Node p){
		if(p!=null){
			visit(p);
			preorder(p.getLeft());
			preorder(p.getRight());
		}
	}
	
	/**µ›πÈ ÷––Ú*/
	protected static void inorder(Node p){
		if(p!=null){
			inorder(p.getLeft());
			visit(p);
			inorder(p.getRight());
		}
	}
	
	/**µ›πÈ ∫Û–Ú*/
	protected static void postorder(Node p){
		if(p!=null){
			postorder(p.getLeft());
			postorder(p.getRight());
			visit(p);
		}
	}
	
	/**∑«µ›πÈ œ»–Ú*/
	protected static void interativePreorder(Node p){
		Stack<Node> stack=new Stack<Node>();
		if(p!=null){
			stack.push(p);
			while (!stack.empty()){
				p=stack.pop();
				visit(p);
				if(p.getRight()!=null)
					stack.push(p.getRight());
				if(p.getLeft()!=null)
					stack.push(p.getLeft());
			}
		}
		}
	protected static void interativePreorder2(Node p){
		Stack<Node> stack =new Stack<>();
		Node node=p;
		while(node!=null||stack.size()>0){
			while(node!=null){
				visit(node);
				stack.push(node);
				node=node.getLeft();
			}
			if(stack.size()>0){
				node=stack.pop();
				node=node.getRight();
			}
		}
	}
	protected static void interativePostorder(Node p){
		
	}
}
