import java.util.Iterator;
import java.util.TreeSet;


public class ImpComparable {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<DogComparables> d=new TreeSet<DogComparables>();
		d.add(new DogComparables(4));
		d.add(new DogComparables(6));
		d.add(new DogComparables(2));
		d.add(new DogComparables(8));
		d.add(new DogComparables(3));
		 Iterator it = d.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	}
}
