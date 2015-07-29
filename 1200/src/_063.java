import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;


public class _063 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		System.out.println("输入一个数：");
		BigDecimal b=sca.nextBigDecimal();
		System.out.println(Convert(b));
	}

	private static String Convert(BigDecimal b) {
		// TODO Auto-generated method stub
		DecimalFormat df=new DecimalFormat("#0.###");
		String strNum=df.format(b);
		if(strNum.indexOf('.')!=-1){
			String num=strNum.substring(0, strNum.indexOf('.'));
			if(num.length()>12){
				System.out.println("无法转换");
				return " ";
			}
	}
		String point="";
		if(strNum.indexOf('.')!=-1){
			point="元";
		}else{
			point="元整";
		}
		String result=getInteger(strNum)+point+getDecimal(strNum);
		return result;
	}

	private static String getDecimal(String strNum) {
		// TODO Auto-generated method stub
		return null;
		
	}

	private static String getInteger(String strNum) {
		// TODO Auto-generated method stub
		if(strNum.indexOf('.')!=-1)
			strNum=strNum.substring(0,strNum.indexOf('.'));
		strNum=new StringBuffer(strNum).reverse().toString();
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<strNum.length();i++)
		{
			temp.append(STR_UNIT[i]);
		}
		return null;
	}
	

}
