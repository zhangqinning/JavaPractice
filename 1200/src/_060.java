import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class _060 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("����һ�����֣�");
	    BigDecimal b=scanner.nextBigDecimal();
	    System.out.println("��ͬ��ʽ�Ļ�����ʽ");
	    NumberFormat format=NumberFormat.getCurrencyInstance(Locale.CHINA);
	    System.out.println("Locale.CHINA"+format.format(b));
	    format=NumberFormat.getCurrencyInstance(Locale.US);
	    System.out.println("locale.US"+format.format(b));
	}

}
