import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class _062 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		DateFormat datefromat=DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
		System.out.println("�й�ʱ��: "+datefromat.format(date));
		datefromat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println("����ʱ��: "+datefromat.format(date));
	}

}
