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
		System.out.println("中国时间: "+datefromat.format(date));
		datefromat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println("美国时间: "+datefromat.format(date));
	}

}
