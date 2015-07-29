import java.util.Scanner;


public class _065 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca=new Scanner(System.in);
		System.out.println("输入英文");
		String s=sca.nextLine();
		System.out.println("输出大写");
		System.out.println(""+s.toUpperCase());
		System.out.println("输出小写");
		System.out.println(""+s.toLowerCase());
	}

}
