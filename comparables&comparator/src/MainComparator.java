import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class MainComparator {

	
	public static void main(String[] args) {
		ArrayList l=new ArrayList<HDTVwithComparator>();
		HDTVwithComparator h1=new HDTVwithComparator(45, "sumsung");
		HDTVwithComparator h2=new HDTVwithComparator(43, "sony");
		HDTVwithComparator h3=new HDTVwithComparator(57, "LG");
		HDTVwithComparator h4=new HDTVwithComparator(67, "panasonic");
		
		l.add(h4);
		l.add(h3);
		l.add(h2);
		l.add(h1);
		
		Collections.sort(l, new SizeComparator());
		Collections.reverse(l);
		
		
//		Collections.reverseOrder();
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			HDTVwithComparator h = (HDTVwithComparator) iterator.next();
			System.out.print(h.getBarnd());
			System.out.println("   "+h.getSize());
		}


	}

}
