
public class HDTV implements Comparable<HDTV>{

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private int size ;
	private String brand;
	
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
	@Override
	public int compareTo(HDTV o) {
		if (this.getSize()>o.getSize()){
			return 1;
		}else if(this.getSize()<o.getSize()) {
			return -1;
		}else{
		return 0;}
	}

}
