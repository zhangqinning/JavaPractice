import java.util.Comparator;


public class SizeComparator implements Comparator<HDTVwithComparator>{

	@Override
	public int compare(HDTVwithComparator o1, HDTVwithComparator o2) {
		int s1=o1.getSize();
		int s2=o2.getSize();
		if (s1>s2){
			return 1;
		}else if (s1<s2){
			return -1;
		}else{
			return 0;
		}
	}
}
