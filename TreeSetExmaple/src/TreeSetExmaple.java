import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExmaple {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tree Set Examole\n");
		TreeSet<Integer> tree=new TreeSet<Integer>();
	    tree.add(12);
	    tree.add(54);
	    tree.add(22);
	    tree.add(11);
	    
	    Iterator<Integer> iterator=tree.iterator();
	    System.out.print("Tree set data:");
	    
	    while(iterator.hasNext()){
	    	System.out.print(iterator.next()+"");
	    }
	    System.out.println();
	    
	    if(tree.isEmpty()){
	    	System.out.print("Tree Set is empty.");
	    }else{
	    	System.out.print("Tree Set size:"+ tree.size());
	    }
	    
	    System.out.println("First data:"+tree.first());
	    
	    System.out.println("Last data:"+tree.last());
	    
	    if (tree.remove(12)){
	    	System.out.println("Data is removed from tree set");
	    }else{
	    	System.out.println("Data doesn't exist");
	    }
	    System.out.print("Nowthe tree set contain:");
	    iterator=tree.iterator();
	    
	    while (iterator.hasNext()){
	    	System.out.print(iterator.next()+"");
	    }
	    System.out.println();
	    System.out.println("Now the size of tree set:"+ tree.size());
	    
	    tree.clear();
	    if(tree.isEmpty()){
	    	System.out.print("Tree Set is empty.");
	    }else{
	    	System.out.print("Tree Set size:"+ tree.size());
	    }
	}

}
