import java.util.Scanner;


public class _068 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������");
		Scanner sca=new Scanner(System.in);
		String request=sca.nextLine();
		if(request.startsWith("http"))
			System.out.println("���������ַ");
		else if(request.startsWith("ftp"))
		System.out.println("�������ftp������");
		else 
			System.out.println("�������");
	}

}









