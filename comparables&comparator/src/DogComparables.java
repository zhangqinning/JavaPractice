
public class DogComparables implements Comparable<DogComparables> {

	int size;
	DogComparables(int s){
		size=s;
	}
	@Override
	public int compareTo(DogComparables o) {
		
		return this.size-o.size;
	}
}
