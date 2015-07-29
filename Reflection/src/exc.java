import java.io.Console;
import java.util.HashSet;
import java.util.Set;


public class exc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[1024];
		Class c = bytes.getClass();
		System.out.println(c.toString());
		
		Set<String> set=new HashSet<String>();
		Class d = set.getClass();
		System.out.println(d.toString());
		
		Class e = int[][][].class;
		System.out.println(e.toString());
		
	}

}
