import java.math.BigDecimal;
import java.util.Scanner;


public class _070 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������");
		Scanner sca=new Scanner(System.in);
		String request=sca.nextLine();
		try {
			BigDecimal bigDecimal=new BigDecimal(request);	
			System.out.println("������");			
		} catch (Exception e) {
			System.out.println("��������");
			
		}
	}

}
